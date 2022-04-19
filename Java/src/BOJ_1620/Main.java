package BOJ_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static Map<String, Integer> map = new HashMap<>();
    static String[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new String[N + 1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            Object result = null;
            try {
                int number = Integer.parseInt(input);
                result = arr[number];
            } catch (IllegalArgumentException e) {
                result = map.get(input);
            } finally {
                sb.append(result).append('\n');
            }
        }

        System.out.println(sb);
    }
}
