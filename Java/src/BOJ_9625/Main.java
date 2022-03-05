package BOJ_9625;

import java.util.Scanner;

public class Main {
    static int[] a = new int[46];
    static int[] b = new int[46];

    public static void main(String[] args) {
        a[0] = 1;

        for (int i = 1; i <= 45; i++) {
            int tempA = a[i - 1];
            a[i] += b[i - 1];
            b[i] += b[i - 1] + tempA;
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(a[n] + " " + b[n]);
    }
}
