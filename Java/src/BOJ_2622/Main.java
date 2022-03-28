package BOJ_2622;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, answer = 0;

        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = n - i - j;

                if (j > temp) break;

                if (i + j > temp) answer++;
            }
        }

        System.out.println(answer);
    }
}
