package BOJ_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int inputMinute = sc.nextInt();

        hour += inputMinute / 60;
        minute += inputMinute % 60;

        if (minute >= 60) {
            hour += minute / 60;
            minute %= 60;
        }

        if (hour >= 24) {
            hour %= 24;
        }

        System.out.printf("%d %d", hour, minute);
    }
}
