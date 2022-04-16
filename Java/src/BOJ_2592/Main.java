package BOJ_2592;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] arr = new int[10];
    static int[] numbers = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            numbers[arr[i] / 10]++;
        }

        int avg = Arrays.stream(arr).sum() / 10;
        int modeCount = 0;
        int mode = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (modeCount < numbers[i]) {
                modeCount = numbers[i];
                mode = i * 10;
            }
        }

        System.out.println(avg);
        System.out.println(mode);
    }
}
