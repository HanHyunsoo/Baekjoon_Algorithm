package BOJ_2445;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        star(n);
    }

    public static void star(int n) throws Exception {
        /*  n이 5이며 i번째 줄에 별, 공백의 개수
            별: 양옆에 i개 즉 i * 2
            공백: 별 사이에 2 * (n - i) 만큼.
            따라서 공식은
            i + 2 * (n - 1) + i
        */
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            for(int k = 0; k < 2 * (n - i); k++) {
                sb.append(" ");
            }
            for(int m = 0; m < i; m++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            for(int k = 0; k < 2 * (n - i); k++) {
                sb.append(" ");
            }
            for(int m = 0; m < i; m++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}