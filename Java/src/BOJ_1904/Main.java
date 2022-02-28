package BOJ_1904;

import java.util.Scanner;

public class Main {

    static int[] dp = new int[1000001];

    public static void main(String[] args) {

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= 1000000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println(dp[sc.nextInt()]);
    }
}
