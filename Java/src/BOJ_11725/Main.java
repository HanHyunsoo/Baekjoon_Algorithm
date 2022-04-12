package BOJ_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    static int N;
    static HashMap<Integer, ArrayList<Integer>> map;
    static int[] parent, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        map = new HashMap<>();
        IntStream.range(1, N + 1)
                .forEach(x -> map.put(x, new ArrayList<>()));
        parent = new int[N + 1];
        visited = new int[N + 1];

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map.get(a).add(b);
            map.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(parent)
                .filter(x -> x != 0)
                .forEach(x -> sb.append(x).append('\n'));

        System.out.println(sb);
    }

    public static void dfs(int value) {
        visited[value] = 1;

        for (int childValue : map.get(value)) {
            if (visited[childValue] == 0) {
                parent[childValue] = value;
                dfs(childValue);
            }
        }
    }
}
