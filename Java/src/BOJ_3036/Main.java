package BOJ_3036;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger[] arr = new BigInteger[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < N; i++) {
            BigInteger temp = arr[i].gcd(arr[0]);
            sb.append(arr[0].divide(temp)).append('/').append(arr[i].divide(temp)).append('\n');
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
