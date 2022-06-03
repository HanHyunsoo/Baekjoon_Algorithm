package BOJ_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());

        Arrays.sort(numbers);
        int start = 0;
        int end = n - 1;
        int result = 0;

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == x) {
                result++;
                start++;
                end--;
            } else if (sum <= x) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(result);
    }
}
