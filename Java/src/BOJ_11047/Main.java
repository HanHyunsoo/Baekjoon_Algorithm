package BOJ_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coins = new int[N];
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            coins[i]= Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (coins[i] > K) {
                continue;
            }

            int temp = K;
            int count = 0;
            for (int j = i; j >= 0; j--) {
                count += temp / coins[j];
                temp %= coins[j];

                if (K == 0) {
                    break;
                }
            }

            result = Math.min(result, count);
        }

        System.out.println(result);
    }
}
