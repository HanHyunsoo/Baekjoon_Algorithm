package BOJ_9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 3; i++) {
            dp[i] = 1;
        }

        for (int i = 4; i <= 100; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            System.out.println(dp[Integer.parseInt(br.readLine())]);
        }
    }
}
