package BOJ_5525;

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder("I");
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();

        sb.append("OI".repeat(N));

        for (int i = 0; i < M - (sb.length() - 1); i++) {
            String temp = S.substring(i, i + sb.length());
            if (temp.equals(sb.toString())) {
                count++;
            }
        }

        System.out.println(count);
    }
}
