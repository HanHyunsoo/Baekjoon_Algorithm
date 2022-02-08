package BOJ_9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] strings = br.readLine().split(" ");

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < strings.length; j++) {
                for (int k = strings[j].length() - 1; k >= 0; k--) {
                    sb.append(strings[j].charAt(k));
                }
                sb.append(' ');
            }

            System.out.println(sb);
        }
    }
}
