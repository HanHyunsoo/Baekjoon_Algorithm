package BOJ_16505;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String makeStar(int n) {
        if (n == 0) {
            return "*";
        }

        String[] stars = makeStar(n - 1).split("\n");
        StringBuilder sb = new StringBuilder();

        Arrays.stream(stars).forEach(x -> sb.append(String.format("%-" + (int) Math.pow(2, n) + "s", x.repeat(2))).append('\n'));
        Arrays.stream(stars).forEach(x -> sb.append(String.format("%-" + (int) Math.pow(2, n) + "s", x)).append('\n'));

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] stars = makeStar(sc.nextInt()).split("\n");

        Arrays.stream(stars).forEach(x -> System.out.println(x.trim()));
    }
}
