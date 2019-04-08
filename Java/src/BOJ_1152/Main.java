package BOJ_1152;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strInput = br.readLine();
        br.close();

        String[] resultArr = strInput.split(" ");
        int count = 0;
        for(String countArr : resultArr) {
            if(countArr.equals("")) continue;
            count++;
        }
        
        System.out.println(count);
    }
}