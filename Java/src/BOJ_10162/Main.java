package BOJ_10162;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fiveMinute = 0;
        int minute = 0;
        int tenSecond = 0;

        int T = sc.nextInt();

        fiveMinute += T / 300;
        T %= 300;

        minute += T / 60;
        T %= 60;

        tenSecond += T / 10;
        T %= 10;

        String result = (T == 0) ? String.format("%d %d %d", fiveMinute, minute, tenSecond) : "-1";

        System.out.println(result);
    }
}
