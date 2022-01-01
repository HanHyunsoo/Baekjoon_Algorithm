package BOJ_10102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        int countA = countChar(vote, 'A');
        int countB = countChar(vote, 'B');

        if (countA > countB) {
            System.out.println('A');
        } else if (countA < countB) {
            System.out.println('B');
        } else {
            System.out.println("Tie");
        }
    }

    static int countChar(String s, char ch) {
        return (int) s.chars()
                .filter(c -> c == ch)
                .count();
    }
}
