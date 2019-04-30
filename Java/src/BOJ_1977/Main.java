package BOJ_1977;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        br.close();
        int min = 10001;
        int sum = 0;
        for (int i = m; i < (n + 1); i++) {
            if (checkInt(Math.sqrt(i))) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }

    public static boolean checkInt(double n) {
        String changeStringN = String.valueOf(n);
        if (changeStringN.substring(changeStringN.length() - 2).equals(".0")) {
            return true;
        } else {
            return false;
        }
    }
}