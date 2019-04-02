package BOJ_1924;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] weekArr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        br.close();

        if(month != 1) {
            for(int i = 0; i < (month - 1); i++) { // 전체 일수 나머지 7의 값으로 weekArr에서 요일을 뽑을 수 있음.
                day += dayArr[i];
            }
        }
        System.out.println(weekArr[day % 7]);
    }
}