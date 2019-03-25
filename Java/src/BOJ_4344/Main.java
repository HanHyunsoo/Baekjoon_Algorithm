package BOJ_4344;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());
        for(int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] numArr = new int[n];

            for(int j = 0; j < n; j++) {
                numArr[j] = Integer.parseInt(st.nextToken());
            }

            System.out.printf("%.3f%%\n", avgCheck(avg(numArr), numArr));
        }
    }
    public static double avg(int arr[]) {
        double result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        result /= arr.length;

        return result;
    }

    public static double avgCheck(double avg, int arr[]) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg) {
                count++;
            }
        }

        double result = (double)count / arr.length * 100;
        return result;
    }
}