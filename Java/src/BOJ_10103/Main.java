package BOJ_10103;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 100;
        int s = 100;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) c -= b;
            else if (a > b) s -= a;
        }

        System.out.println(c + "\n" + s);
    }
}
