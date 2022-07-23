package BOJ_10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] plusArr = new int[101];
        int[] minusArr = new int[101];
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();

            if (value >= 0) {
                plusArr[value]++;
            } else {
                minusArr[Math.abs(value)]++;
            }
        }

        int v = sc.nextInt();
        int answer = (v >= 0) ? plusArr[v] : minusArr[Math.abs(v)];
        System.out.println(answer);
    }
}
