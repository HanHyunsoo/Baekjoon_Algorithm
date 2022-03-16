package BOJ_2573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M;
    static int[][] matrix;
    static int[][] visited;
    static int totalIceberg = 0;
    static int totalYear = 0;
    static Queue<Location> queue = new LinkedList<>();
    static int[] moveY = {0, 1, 0, -1};
    static int[] moveX = {1, 0, -1, 0};

    public static boolean isValidIndex(int y, int x) {
        return 0 <= y && y < N && 0 <= x && x < M;
    }

    public static void dfs(int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + moveY[i];
            int nx = x + moveX[i];

            if (isValidIndex(ny, nx) && visited[ny][nx] == 0) {
                dfs(ny, nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        matrix = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if (matrix[i][j] != 0) {
                    queue.add(new Location(i, j));
                    totalIceberg++;
                } else {
                    visited[i][j] = 1;
                }
            }
        }

        while (totalIceberg != 0) {
            List<Location> list = new ArrayList<>();
            int countIceberg = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (matrix[i][j] > 0 && visited[i][j] == 0) {
                        dfs(i, j);
                        countIceberg++;
                    }
                }
            }

            if (countIceberg >= 2) {
                break;
            }

            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }

            list.forEach(Location::setZero);
            list.forEach(Location::changeValue);

            totalYear++;
        }

        System.out.println((totalIceberg != 0) ? totalYear : 0);
    }
}

class Location {
    int y;
    int x;
    int zero;

    public Location(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public void setZero() {
        zero = 0;

        for (int i = 0; i < 4; i++) {
            int ny = y + Main.moveY[i];
            int nx = x + Main.moveX[i];

            if (Main.isValidIndex(ny, nx) && Main.matrix[ny][nx] == 0) {
                zero++;
            }
        }
    }

    public void changeValue() {
        Main.matrix[y][x] -= zero;
        if (Main.matrix[y][x] <= 0) {
            Main.matrix[y][x] = 0;
            Main.visited[y][x] = 1;
            Main.totalIceberg--;
        } else {
            Main.queue.add(this);
            Main.visited[y][x] = 0;
        }
    }
}