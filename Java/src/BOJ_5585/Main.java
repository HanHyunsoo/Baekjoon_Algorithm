package BOJ_5585;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] coinArr = {500, 100, 50, 10, 5, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputMoney = 1000 - Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int coin : coinArr) {
            count += inputMoney / coin;
            inputMoney %= coin;
        }

        System.out.println(count);
    }
}