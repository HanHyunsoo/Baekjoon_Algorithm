package BOJ_16918;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] matrix;
    static int[] moveY = {1, 0, -1, 0};
    static int[] moveX = {0, 1, 0, -1};
    static int r;
    static int c;
    static int n;


    static void bomb(int y, int x) {
        matrix[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int tempY = y + moveY[i];
            int tempX = x + moveX[i];
            if (0 <= tempX && tempX < c && 0 <= tempY && tempY < r) {
                matrix[tempY][tempX] = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        if (n == 1) {
            for (int i = 0; i < r; i++) {
                sb.append(br.readLine()).append('\n');
            }
        } else if (n % 2 == 0) {
            for (int i = 0; i < r; i++) {
                sb.append("O".repeat(c)).append("\n");
            }
        } else if (n % 2 == 1) {
            matrix = new int[r][c];

            for (int i = 0; i < r; i++) {
                String command = br.readLine();
                for (int j = 0; j < c; j++) {
                    char temp = command.charAt(j);
                    if (temp == 'O') {
                        bomb(i, j);
                    }
                }
            }

            for (int i = 0; i < n / 2 - 1; i++) {
                int[][] tempMatrix = matrix;
                matrix = new int[r][c];
                for (int j = 0; j < r; j++) {
                    for (int k = 0; k < c; k++) {
                        int temp = tempMatrix[j][k];
                        if (temp == 0) {
                            bomb(j, k);
                        }
                    }
                }
            }

            for (int i = 0; i < r; i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < c; j++) {
                    int temp = matrix[i][j];
                    if (temp == 1) {
                        line.append('.');
                    } else if (temp == 0) {
                        line.append('O');
                    }
                }
                sb.append(line).append('\n');
            }
        }

        System.out.println(sb);
    }
}
