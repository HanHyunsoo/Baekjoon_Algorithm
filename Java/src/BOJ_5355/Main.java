package BOJ_5355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static double answer;

    static void checkOperator(String input) {
        switch (input) {
            case "@":
                answer *= 3;
                break;
            case "%":
                answer += 5;
                break;
            case "#":
                answer -= 7;
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            answer = Double.parseDouble(st.nextToken());

            while (st.hasMoreTokens()) {
                checkOperator(st.nextToken());
            }

            System.out.printf("%.2f\n", answer);
        }
    }
}
