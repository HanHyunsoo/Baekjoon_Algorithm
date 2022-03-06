package BOJ_17202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String recursion(String input) {
        if (input.length() <= 2) {
            return input;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            sb.append((Character.getNumericValue(input.charAt(i)) + Character.getNumericValue(input.charAt(i + 1))) % 10);
        }

        return recursion(sb.toString());
    }

    static String shuffleString(String a , String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            sb.append(a.charAt(i)).append(b.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        System.out.println(recursion(shuffleString(a, b)));
    }
}
