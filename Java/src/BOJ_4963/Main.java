package BOJ_4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int w, h;
    static int[][] matrix;
    static int[][] visited;
    static int[] moveX = {0, 1, 0, -1, 1, -1, 1, -1};
    static int[] moveY = {1, 0, -1, 0, 1, -1, -1, 1};
    static int count;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void makeMatrix(int w, int h) throws IOException {
        matrix = new int[h][w];
        visited = new int[h][w];

        for (int i = 0; i < h; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                int temp = Integer.parseInt(st.nextToken());
                matrix[i][j] = temp;
                visited[i][j] = (temp == 1) ? 0 : 1;
            }
        }

        count = 0;
    }

    public static void dfs(int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 8; i++) {
            int ny = y + moveY[i];
            int nx = x + moveX[i];

            if (0 <= ny && ny < h && 0 <= nx && nx < w) {
                if (visited[ny][nx] == 0 && matrix[ny][nx] == 1) {
                    dfs(ny, nx);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            makeMatrix(w, h);

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (visited[i][j] == 0 && matrix[i][j] == 1) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
