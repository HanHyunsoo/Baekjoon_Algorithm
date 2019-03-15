package BOJ_2460;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int STATION = 10;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int case_people = 0;
        
        for(int i = 0; i < STATION; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out_train = Integer.parseInt(st.nextToken());
            int in_train = Integer.parseInt(st.nextToken());
            case_people += in_train - out_train;

            if(max < case_people) {
                max = case_people;
            }
        }
        
        System.out.println(max);
    }
}