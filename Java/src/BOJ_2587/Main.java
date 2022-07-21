package BOJ_2587;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numberArray = new int[5];

        for (int i = 0; i < 5; i++) {
            numberArray[i] = sc.nextInt();
        }

        Arrays.sort(numberArray);

        System.out.println(Arrays.stream(numberArray).sum() / 5);
        System.out.println(numberArray[2]);
    }
}
