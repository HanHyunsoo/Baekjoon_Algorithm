package BOJ_2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] matrix;
    static int[] visited;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int child = Integer.parseInt(st.nextToken());
        int parent = Integer.parseInt(st.nextToken());

        matrix = new int[n + 1][n + 1];
        visited = new int[n + 1];
        depth = new int[n + 1];

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }


        Queue<Integer> queue = new LinkedList<>();
        queue.add(child);
        visited[child] = 1;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            if (temp == parent) break;

            for (int i = 1; i <= n; i++) {
                if (visited[i] == 0 && matrix[temp][i] == 1) {
                    visited[i] = 1;
                    depth[i] += depth[temp] + 1;
                    queue.add(i);
                }
            }
        }

        System.out.println(depth[parent] <= 0 ? -1 : depth[parent]);
    }
}