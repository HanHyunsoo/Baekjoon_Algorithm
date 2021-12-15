package BOJ_11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 2;

        while (n > 1) {
            if (n % value == 0) {
                System.out.println(value);
                n /= value;

            } else {
                value++;
            }
        }
    }
}
