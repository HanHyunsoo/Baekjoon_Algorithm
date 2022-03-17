package BOJ_15649;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] array;
    static int[] visited;

    public static void dfs(int depth) {
        if (depth == M) {
            Arrays.stream(array).filter(x -> x != 0).forEach(x -> System.out.print(x + " "));
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                array[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        array = new int[N];
        visited = new int[N];

        dfs(0);
    }
}
