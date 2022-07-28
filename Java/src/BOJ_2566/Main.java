package BOJ_2566;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = -1;
        int y = 0;
        int x = 0;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int value = sc.nextInt();
                if (maxValue < value) {
                    y = i;
                    x = j;
                    maxValue = value;
                }
            }
        }

        System.out.printf("%d\n%d %d\n", maxValue, y, x);
    }
}
