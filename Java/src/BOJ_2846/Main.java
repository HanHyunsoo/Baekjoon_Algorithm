package BOJ_2846;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] dp;
    static int[] height;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        dp = new int[N];
        height = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            if (height[i] > height[i - 1]) {
                dp[i] = height[i] - height[i - 1] + dp[i - 1];
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
