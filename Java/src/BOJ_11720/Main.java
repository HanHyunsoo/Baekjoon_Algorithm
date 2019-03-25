package BOJ_11720;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String stringN = br.readLine();
        br.close();

        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += (stringN.charAt(i) - '0');
        }

        System.out.println(sum);
    }
}