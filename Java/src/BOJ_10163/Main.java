package BOJ_10163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map = new int[1002][1002];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            for (int j = a; j < a + c; j++) {
                for (int k = b; k < b + d; k++) {
                    map[j][k] = i;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            int count = 0;

            for (int j = 0; j < 1002; j++) {
                for (int k = 0; k < 1002; k++) {
                    if (map[j][k] == i) count++;
                }
            }

            System.out.println(count);
        }
    }
}
