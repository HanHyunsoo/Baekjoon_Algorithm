package BOJ_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] arr, visited;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i = 1; i <= M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                arr[depth + 1] = i;
                dfs(depth + 1);
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M + 1];
        visited = new int[N + 1];
        dfs(0);

        System.out.println(sb);
    }
}
