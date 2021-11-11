package BOJ_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int v;
    static int[][] array;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        array = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            array[x][y] = 1;
            array[y][x] = 1;
        }
        dfs(v);
        System.out.println();
        Arrays.fill(visited, false);
        bfs(v);

        br.close();
    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 1; i < array[v].length; i++) {
            if (array[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            int temp = queue.remove();
            System.out.print(temp + " ");
            for (int i = 1; i < array.length; i++) {
                if (array[temp][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println();
    }
}
