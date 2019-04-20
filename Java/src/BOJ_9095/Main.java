package BOJ_9095;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp(n));
        }
        br.close();
    }

    public static int dp(int n) {
        int[] arr = {0, 1, 2, 4};
        if(n < 4) return arr[n];
        return dp(n - 1) + dp(n - 2) + dp(n - 3);
    }
}