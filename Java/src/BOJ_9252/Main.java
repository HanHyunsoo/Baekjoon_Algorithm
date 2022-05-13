package BOJ_9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] dp;
    static String x, y;
    static StringBuilder result = new StringBuilder();

    public static void lcs(int m, int n) {
        dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
    }

    public static void traceBack(int m, int n) {
        int c = m;
        int r = n;

        while (dp[c][r] != 0) {
            if (x.charAt(c - 1) == y.charAt(r - 1)) {
                result.append(x.charAt(c - 1));
                c--;
                r--;
            } else if (dp[c - 1][r] > dp[c][r - 1]) {
                c--;
            } else {
                r--;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = br.readLine();
        y = br.readLine();

        lcs(x.length(), y.length());
        System.out.println(dp[x.length()][y.length()]);
        if (dp[x.length()][y.length()] != 0) {
            traceBack(x.length(), y.length());
            System.out.println(result.reverse());
        }
    }
}
