package BOJ_1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] matrix;
    static int N;

    public static void quadTree(int x, int y, int size) {
        if (isSameDots(x, y, size)) {
            sb.append(matrix[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');
        quadTree(x, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x + newSize, y + newSize, newSize);
        sb.append(')');
    }

    public static boolean isSameDots(int x, int y, int size) {
        int color = matrix[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (color != matrix[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                matrix[i][j] = input.charAt(j) - '0';
            }
        }

        quadTree(0, 0, N);
        System.out.println(sb);
    }
}
