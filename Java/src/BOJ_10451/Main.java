package BOJ_10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] map;
    static int[] visited;
    static int count, N;

    public static void dfs(int v) {
        visited[v] = 1;

        int next = map[v];

        if (visited[next] == 0) {
            dfs(next);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            map = new int[N + 1];
            visited = new int[N + 1];
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int v = 1; v <= N; v++) {
                map[v] = Integer.parseInt(st.nextToken());
            }

            for (int v = 1; v <= N; v++) {
                if (visited[v] == 0) {
                    dfs(v);
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
