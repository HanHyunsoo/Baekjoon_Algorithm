package BOJ_10867;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] plus = new int[1001];
    static int[] minus = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(st.nextToken());

            if (inputNumber < 0) {
                minus[inputNumber * (-1)] = 1;
            } else {
                plus[inputNumber] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1000; i >= 0; i--) {
            if (minus[i] == 1) {
                sb.append(i * (-1)).append(" ");
            }
        }

        for (int i = 0; i <= 1000; i++) {
            if (plus[i] == 1) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}
