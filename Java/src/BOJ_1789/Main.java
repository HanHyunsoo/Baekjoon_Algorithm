package BOJ_1789;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        long sum = 0;
        long num = 0;

        int count = 0;

        while (true) {
            sum = sum + num;
            count++;
            if (sum > s) {
                count--;
                break;
            }
            num++;
        }

        System.out.println(count - 1);
    }
}
