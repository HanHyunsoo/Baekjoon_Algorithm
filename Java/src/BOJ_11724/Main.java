package BOJ_11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] matrix;
    static int[] visited;
    static int count = 0;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        matrix = new int[n + 1][n + 1];
        visited = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (visited[i] != 1 && matrix[i][j] == 1) {
                    dfs(i);
                    count++;
                }
            }
        }

        count += Arrays.stream(visited).filter(x -> x == 0).count() - 1;
        System.out.println(count);
    }

    public static void dfs(int x) {
        visited[x] = 1;

        for (int i = 1; i <= n; i++) {
            if (visited[i] != 1 && matrix[x][i] == 1) {
                dfs(i);
            }
        }
    }
}
