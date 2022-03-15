package BOJ_2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int count = 0;
    static int result = Integer.MIN_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[][] matrix;
    static int[][] visited;
    static int[] moveY = {0, 1, 0, -1};
    static int[] moveX = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visited = new int[n][n];
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                max = Math.max(temp, max);

                if (temp <= n) {
                    visited[i][j] = 1;
                }

                matrix[i][j] = temp;
            }
        }

        for (int i = 0; i < max; i++) {
            visited = makeVisited(i);
            count = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (matrix[j][k] > i && visited[j][k] != 1) {
                        dfs(j, k);
                        count++;
                    }
                }
            }

            result = Math.max(count, result);
        }

        System.out.println(result);
    }

    public static int[][] makeVisited(int depth) {
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] <= depth) {
                    result[i][j] = 1;
                }
            }
        }

        return result;
    }

    public static void dfs(int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + moveY[i];
            int nx = x + moveX[i];

            if (0 <= ny && ny < n && 0 <= nx && nx < n) {
                if (visited[ny][nx] != 1) {
                    dfs(ny, nx);
                }
            }
        }
    }
}
