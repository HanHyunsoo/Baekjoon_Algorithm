package BOJ_3040;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - numbers[i] - numbers[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j) continue;
                        System.out.println(numbers[k]);
                    }
                }
            }
        }
    }
}
