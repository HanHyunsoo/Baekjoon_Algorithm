package BOJ_9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String name = st.nextToken();
                String kind = st.nextToken();

                if (!map.containsKey(kind)) map.put(kind, 1);
                else map.put(kind, map.get(kind) + 1);
            }

            AtomicInteger result = new AtomicInteger(1);
            map.values().forEach(x -> result.updateAndGet(v -> v * (x + 1)));

            System.out.println(result.get() - 1);
        }
    }
}
