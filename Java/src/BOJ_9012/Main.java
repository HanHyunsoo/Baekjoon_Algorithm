package BOJ_9012;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++) {
            String inputString = br.readLine();
            if(checkBracket(inputString)) System.out.println("YES");
            else System.out.println("NO");
        }
        br.close();
    }

    public static boolean checkBracket(String str) {
        int count = 0; // count 변수를 만들어 이 변수로 문자열을 체크한다.
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') count++; // 문자가 (면 count에 1을 더한다.
            else { // 문자가 )면 count에 1을 빼는데 여기서 count가 음수면 VPS가 아니므로 False반환
                count--;
                if(count < 0) return false;
            }
        }
        if(count == 0) return true; // 문자가 0이면 (와 )의 개수가 딱 맞으므로 True반환
        else return false; // 위에서 음수는 조건으로 판별 했으므로 0보다 크면 문자가 남아서 False반환
    }
}