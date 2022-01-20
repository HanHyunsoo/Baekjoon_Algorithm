package BOJ_2583;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] matrix = new int[101][101];
    static int[][] visited = new int[101][101];
    static int[] moveX = {1, 0, -1, 0};
    static int[] moveY = {0, 1, 0, -1};
    static int count;
    static List<Integer> result = new ArrayList<>();
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            int[] loc = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            fillMatrix(loc[0], loc[1], loc[2], loc[3]);
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == 0 && matrix[i][j] == 0) {
                    count = 1;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        result.forEach(x -> System.out.print(x + " "));
    }

    public static void fillMatrix(int downX, int downY, int upX, int upY) {
        for (int i = downY; i < upY; i++) {
            for (int j = downX; j < upX; j++) {
                matrix[i][j] = 1;
                visited[i][j] = 1;
            }
        }
    }

    public static void dfs(int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + moveY[i];
            int nx = x + moveX[i];

            if (0 <= ny && ny < M && 0 <= nx && nx < N) {
                if (visited[ny][nx] == 0 && matrix[ny][nx] == 0) {
                    count++;
                    dfs(ny, nx);
                }
            }
        }
    }
}
