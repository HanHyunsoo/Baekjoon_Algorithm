package BOJ_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), 0);
        }

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) set.add(input);
        }

        StringBuilder sb = new StringBuilder(set.size() + "\n");
        set.forEach(x -> sb.append(x).append('\n'));
        System.out.println(sb);
    }
}
