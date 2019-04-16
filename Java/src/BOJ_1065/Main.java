package BOJ_1065;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(countHansu(n));
    }

    public static boolean checkHansu(int n) {
        if(n < 100) return true; // 100 미만은 전부 한수에 해당하므로 true반환.

        int[] digits = new int[String.valueOf(n).length()]; // 입력받은 자릿수 만큼 배열을 생성
        for(int i = 0; i < digits.length; i++) {
            digits[i] = String.valueOf(n).charAt(i); // 각 자릿수의 값을 배열에 저장.
        }

        int d = digits[digits.length - 1] - digits[digits.length - 2]; // 공차는 마지막 항이 n이면 n - (n - 1)이다.
        for(int i = 0; i < digits.length - 1; i++) { // 항이 n이면 항 n의 값과 d를 더한 값이 n + 1항의 값과 다르면 한수가 아니므로 false반환.
            if(digits[i] + d != digits[i + 1]) return false;
        }
        // 그 이외에는 공차가 각각 자릿수에 성립하므로 true반환.
        return true;
    }

    public static int countHansu(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) { // 1부터 n까지 각각 한수(true)이면 result에 1을 더한다.
            if(checkHansu(i)) result++;
        }

        return result;
    }
}