package BOJ_2789;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static String exceptWord = "CAMBRIDGE";

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] wordArr = br.readLine().toCharArray();
        br.close();
        
        for(char word : wordArr) {
            if(exceptWord.indexOf(word) == -1) System.out.print(word);
        }
    }
}