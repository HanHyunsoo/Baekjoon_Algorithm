package BOJ_2669;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[101][101];

        for (int i = 0; i < 4; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = y1; j < y2; j++) {
                for (int k = x1; k < x2; k++) {
                    matrix[j][k] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
