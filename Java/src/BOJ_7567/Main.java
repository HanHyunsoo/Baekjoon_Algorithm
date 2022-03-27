package BOJ_7567;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int result = 10;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result += 10;
            } else {
                result += 5;
            }
        }

        System.out.println(result);
    }
}
