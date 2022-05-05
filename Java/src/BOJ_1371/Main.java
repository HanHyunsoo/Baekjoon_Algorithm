package BOJ_1371;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    static int[] countAlphabet = new int[26];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder s = new StringBuilder();

        while ((input = br.readLine()) != null) {
            s.append(input);
        }

        s.chars().filter(x -> x != ' ').forEach(x -> countAlphabet[x - 97]++);
        int max = Arrays.stream(countAlphabet).max().getAsInt();
        IntStream.range(0, countAlphabet.length)
                .filter(x -> countAlphabet[x] == max)
                .forEach(x -> System.out.print((char) (x + 97)));
    }
}
