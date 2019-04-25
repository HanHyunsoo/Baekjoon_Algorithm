package BOJ_1932;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++) {
            String[] inputNums = br.readLine().split(" ");
            for(int j = 0; j < inputNums.length; j++) {
                dp[i][j] = Integer.parseInt(inputNums[j]);
            }
        }
        br.close();

        for(int i = 1; i < dp.length; i++) {
            for(int j = 0; j < dp[i].length; j++) {
                if(i < j) continue;

                if(j == 0) {
                    dp[i][j] += dp[i - 1][j];
                } else if(j == i) {
                    dp[i][j] += dp[i - 1][j - 1];
                } else {
                    dp[i][j] = max(dp[i][j] + dp[i - 1][j - 1], dp[i][j] + dp[i - 1][j]);
                }
            }
        }

        System.out.println(maxArr(dp[n - 1]));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int maxArr(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if(num > max) max = num;
        }
        return max;
    }
}