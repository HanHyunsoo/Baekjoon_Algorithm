package BOJ_2577;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;
        for(int i = 0; i < 3; i++) result *= Integer.parseInt(br.readLine());
        br.close();

        char[] numbers = String.valueOf(result).toCharArray();

        int[] arrN = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int j = 0; j < arrN.length; j++) {
            for(char number : numbers) {
                if((number - 48) == j) arrN[j]++;
            }
        }

        for(int N : arrN) System.out.println(N);
    }
}