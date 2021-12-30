package BOJ_2511;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[10];
        int[] B = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            A[i]= Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        char lastWin = 'D';
        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                totalA += 3;
                lastWin = 'A';
            } else if (A[i] < B[i]) {
                totalB += 3;
                lastWin = 'B';
            } else {
                totalA++;
                totalB++;
            }
        }

        char result;

        if (totalA > totalB) {
            result = 'A';
        } else if (totalA < totalB) {
            result = 'B';
        } else {
            result = lastWin;
        }

        System.out.printf("%d %d\n%c", totalA, totalB, result);
    }
}
