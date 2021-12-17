package BOJ_3009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int[] xMatrix = new int[1001];
        int[] yMatrix = new int[1001];

        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            xMatrix[x]++;
            yMatrix[y]++;
        }

        for (int i = 1; i < xMatrix.length; i++) {
            if (xMatrix[i] == 1) {
                x = i;
                break;
            }
        }

        for (int i = 0; i < yMatrix.length; i++) {
            if (yMatrix[i] == 1) {
                y = i;
                break;
            }
        }

        System.out.printf("%d %d\n", x, y);
    }
}
