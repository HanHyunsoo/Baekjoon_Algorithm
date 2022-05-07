package BOJ_11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<Long, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long input = Long.parseLong(br.readLine());

            if (!map.containsKey(input)) map.put(input, 1);
            else map.put(input, map.get(input) + 1);
        }

        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey().longValue());
    }
}
