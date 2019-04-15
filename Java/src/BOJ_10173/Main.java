package BOJ_10173;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String inputString = br.readLine();
            if(inputString.equals("EOI")) break;

            boolean checkNemo = false;
            for(int i = 0; i < inputString.length() - 3; i++) {
                String caseString = "";
                for(int j = 0; j < 4; j++) {
                    caseString += Character.toLowerCase(inputString.charAt(i + j));
                }
                
                if(caseString.equals("nemo")) {
                    checkNemo = true;
                    break;
                }
            }

            if(checkNemo) bw.write("Found\n");
            else bw.write("Missing\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}