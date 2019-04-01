package BOJ_16673;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());

      int c = Integer.parseInt(st.nextToken());
      int k = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());
      br.close();

      System.out.println(wineCount(c, k, p));
   }

   static int wineCount(int c, int k, int p) {
      int result = 0;
      for(int i = 1; i <= c; i++) result += k * i + p * i * i;
      return result;
   }
}