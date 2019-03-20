package BOJ_10824;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] nArr = new String[4];

        for(int i = 0; i < 4; i++) {
            nArr[i] = st.nextToken();
        }
        br.close();

        long result = Long.parseLong(nArr[0] + nArr[1]) + Long.parseLong(nArr[2] + nArr[3]);
        System.out.println(result);
    }
}

