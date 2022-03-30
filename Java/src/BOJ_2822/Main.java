package BOJ_2822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Problem implements Comparable<Problem> {
    private final int number;
    private final int score;

    public Problem(int number, int score) {
        this.number = number;
        this.score = score;
    }

    public int getNumber() {
        return number;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Problem o) {
        return getScore() - o.getScore();
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Problem[] arr = new Problem[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = new Problem(i + 1, Integer.parseInt(br.readLine()));
        }

        Arrays.sort(arr);

        int sum = 0;
        int[] numberArr = new int[5];

        for (int i = 3; i < 8; i++) {
            sum += arr[i].getScore();
            numberArr[i - 3] = arr[i].getNumber();
        }

        Arrays.sort(numberArr);

        System.out.println(sum);
        Arrays.stream(numberArr).forEach(x -> System.out.print(x + " "));
    }
}
