package BOJ_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int countComputer;
    static int countPair;
    static boolean[] visited;
    static int[][] matrix;
    static int result = 0;

    static void dfs(int v) {
        visited[v] = true;

        for (int i = 1; i < matrix[v].length; i++) {
            if (matrix[v][i] == 1 && !visited[i]) {
                result++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        countComputer = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        countPair = Integer.parseInt(st.nextToken());

        visited = new boolean[countComputer + 1];
        matrix = new int[countComputer + 1][ countComputer + 1];

        for (int i = 0; i < countPair; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[x][y] = 1;
            matrix[y][x] = 1;
        }

        dfs(1);
        System.out.println(result);
    }
}
