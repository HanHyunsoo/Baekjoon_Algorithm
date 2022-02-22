package BOJ_2748;

import java.util.Scanner;

public class Main {

    static long[] dp = new long[91];

    public static void main(String[] args) {

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= 90; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        Scanner sc = new Scanner(System.in);

        System.out.println(dp[sc.nextInt()]);
    }
}
