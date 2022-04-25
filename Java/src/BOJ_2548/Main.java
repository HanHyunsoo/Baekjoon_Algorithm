package BOJ_2548;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = Arrays.stream(arr).sum();
        int answer = 0;

        for (int i = N - 1; i >= 0; i--) {
            int temp = 0;
            for (int j = 0; j < N; j++) {
                temp += Math.abs(arr[j] - arr[i]);
            }

            if (temp <= min) {
                answer = arr[i];
                min = temp;
            }
        }

        System.out.println(answer);
    }
}
