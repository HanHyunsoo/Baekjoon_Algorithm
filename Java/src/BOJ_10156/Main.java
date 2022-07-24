package BOJ_10156;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = K * N - M;
        answer = Math.max(answer, 0);

        System.out.println(answer);
    }
}
