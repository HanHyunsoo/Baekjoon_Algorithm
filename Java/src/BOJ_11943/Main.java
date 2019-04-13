package BOJ_11943;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] basket = new int[4];
        for (int i = 0; i < 4; i += 2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            basket[i] = Integer.parseInt(st.nextToken());
            basket[i + 1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        int[] checkMin = {basket[0] + basket[3], basket[1] + basket[2]};
        System.out.println(checkMin[0] > checkMin[1] ? checkMin[1] : checkMin[0]);
    }
}