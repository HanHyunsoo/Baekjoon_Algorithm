package BOJ_2824;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a = a.multiply(new BigInteger(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            b = b.multiply(new BigInteger(st.nextToken()));
        }

        br.close();

        String result = a.gcd(b).toString();
        if (result.length() > 9) {
            System.out.println(result.substring(result.length() - 9));
        } else {
            System.out.println(result);
        }
    }
}
