package BOJ_2108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] number = new int[4001];
    static int[] minusNumber = new int[4001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] sortedArray = new int[N];
        int[] answer = new int[4];

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp > 0) {
                number[temp]++;
            } else {
                minusNumber[temp * -1]++;
            }

            answer[0] += temp;
        }

        answer[0] = (int) Math.round((double) answer[0] / N);

        int currentIndex = 0;
        int maxCount = -4000;
        for (int i = 4000; i >= 0; i--) {
            maxCount = Math.max(maxCount, minusNumber[i]);

            for (int j = 0; j < minusNumber[i]; j++) {
                sortedArray[currentIndex++] = -i;
            }
        }

        for (int i = 0; i <= 4000; i++) {
            maxCount = Math.max(maxCount, number[i]);

            for (int j = 0; j < number[i]; j++) {
                sortedArray[currentIndex++] = i;
            }
        }

        answer[1] = sortedArray[N / 2];

        int modeCount = 0;

        for (int i = 4000; i >= 0; i--) {
            if (modeCount == 2) break;

            if (minusNumber[i] == maxCount) {
                answer[2] = -i;
                modeCount++;
            }
        }

        for (int i = 0; i <= 4000; i++) {
            if (modeCount == 2) break;

            if (number[i] == maxCount) {
                answer[2] = i;
                modeCount++;
            }
        }

        answer[3] = sortedArray[sortedArray.length - 1] - sortedArray[0];

        Arrays.stream(answer).forEach(System.out::println);

    }
}
