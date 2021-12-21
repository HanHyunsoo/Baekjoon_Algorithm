package BOJ_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] matrix = new int[101][101];
    static int[][] visited = new int[101][101];
    static int[][] distance = new int[101][101];
    static int[] moveX = {1, 0, -1, 0};
    static int[] moveY = {0, 1, 0, -1};
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int[] row = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < row.length; j++) {
                matrix[i][j] = row[j];
            }
        }

        Queue<ArrayList<Integer>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Arrays.asList(0, 0)));
        visited[0][0] = 1;
        distance[0][0] = 1;

        while (!queue.isEmpty()) {
            int x = queue.peek().get(0);
            int y = queue.peek().get(1);

            queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = x + moveX[i];
                int nextY = y + moveY[i];

                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if (visited[nextX][nextY] == 0 && matrix[nextX][nextY] == 1) {
                        visited[nextX][nextY] = 1;
                        queue.add(new ArrayList<>(Arrays.asList(nextX, nextY)));
                        distance[nextX][nextY] = distance[x][y] + 1;
                    }
                }
            }
        }

        System.out.println(distance[n - 1][m - 1]);
    }
}
