package BOJ_2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> countHouse = new ArrayList<>();
    static int count;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            int[] temp = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = temp[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    count = 1;
                    dfs(i, j);
                    countHouse.add(count);
                }
            }
        }

        Collections.sort(countHouse);
        System.out.println(countHouse.size());
        for (int c : countHouse) {
            System.out.println(c);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny);
                    count++;
                }
            }
        }
    }
}
