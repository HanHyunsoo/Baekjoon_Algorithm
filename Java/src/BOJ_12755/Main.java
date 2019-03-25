package BOJ_12755;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int a = 0, b = 9, digit = 1, idx;

        while(true) {
            if(a < n && n <= b) {
                idx = n - a - 1;
                break;
            }
            digit++;
            a = b;

            String lenStringZero = "";
            for(int i = 0; i < (digit - 1); i++) {
                lenStringZero += "0";
            }

            b = a + Integer.parseInt("9" + lenStringZero) * digit;
        }

        String result = String.valueOf((int)Math.pow(10, digit-1) + idx / digit);
        char[] resultArray = result.toCharArray();
        System.out.println(resultArray[idx % digit]);
    }
}