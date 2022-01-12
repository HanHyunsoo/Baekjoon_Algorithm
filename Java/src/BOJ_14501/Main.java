package BOJ_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int result = 0;
    static int matrix[][];
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        matrix = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            matrix[i][0] = t;
            matrix[i][1] = p;
        }

        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (j + matrix[j][0] <= i) {
                    temp = Math.max(temp, matrix[j][1]);
                }
            }
            matrix[i][1] += temp;
        }

        for (int i = 0; i < n; i++) {
            if (i + matrix[i][0] <= n) {
                result = Math.max(result, matrix[i][1]);
            }
        }

        System.out.println(result);
    }
}
