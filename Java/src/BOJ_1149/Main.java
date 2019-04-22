package BOJ_1149;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arrRGB = new int[n + 1][3];
        int[][] dp = new int[n + 1][3];

        for(int i = 0; i < 3; i++) {
            arrRGB[0][i] = dp[0][i] = 0;
        }

        for(int j = 1; j <= n; j++) {
            String[] inputRGB = br.readLine().split(" ");
            for(int k = 0; k < 3; k++) {
                arrRGB[j][k] = Integer.parseInt(inputRGB[k]);
            }
        }
        br.close();

        for(int x = 1; x <= n; x++) {
            dp[x][0] = arrRGB[x][0] + min(dp[x - 1][1], dp[x - 1][2]);
            dp[x][1] = arrRGB[x][1] + min(dp[x - 1][0], dp[x - 1][2]);
            dp[x][2] = arrRGB[x][2] + min(dp[x - 1][0], dp[x - 1][1]);
        }

        System.out.println(min(min(dp[n][0], dp[n][1]), dp[n][2]));
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }
}