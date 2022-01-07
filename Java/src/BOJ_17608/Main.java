package BOJ_17608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] bars = new int[n];

        for (int i = 0; i < n; i++) {
            bars[i] = Integer.parseInt(br.readLine());
        }

        int max = bars[bars.length - 1];
        count++;
        for (int i = bars.length - 1; i >= 0; i--) {
            if (max < bars[i]) {
                max = bars[i];
                count++;
            }
        }

        System.out.println(count);
    }
}
