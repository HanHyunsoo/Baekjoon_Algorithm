package BOJ_2675;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        for(int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            char[] chr = st.nextToken().toCharArray();
            String result = "";

            for(int j = 0; j < chr.length; j++) {
                for(int k = 0; k < repeat; k++) {
                    result += chr[j];
                }
            }

            System.out.println(result);
        }
    }
}