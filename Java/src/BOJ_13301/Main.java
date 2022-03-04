package BOJ_13301;

import java.util.Scanner;

public class Main {
    static long[] dp = new long[81];

    public static void main(String[] args) {
        dp[1] = 4;
        dp[2] = 6;

        Scanner sc = new Scanner(System.in);

        for (int i = 3; i <= 80; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[sc.nextInt()]);
    }
}
