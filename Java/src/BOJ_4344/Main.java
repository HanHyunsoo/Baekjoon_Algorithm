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
            int[] numArr = new int[n]; // n명의 사람들의 각각의 점수를 저장하기위해 n개의 배열을 생성한다.

            for(int j = 0; j < n; j++) {
                numArr[j] = Integer.parseInt(st.nextToken()); // 각각 i에 해당하는 인덱스에 점수를 저장한다.
            }

            System.out.printf("%.3f%%\n", avgCheck(avg(numArr), numArr));
        }
    }
    public static double avg(int arr[]) { // 배열을 매개변수로 double형 평균을 반환하는 함수.
        double result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i]; // result 변수에 배열에 있는 모든 숫자를 다 더한다.
        }
        result /= arr.length; // 배열의 크기만큼 나누면 평균으로 변한다.

        return result;
    }

    public static double avgCheck(double avg, int arr[]) { // 평균이 넘는지 확인하기위해 평균과 평균을 넘는지 확인하기위해 배열을 매개변수로 받는다.
        int count = 0; // 평균 넘는 사람을 구하기위해 count 변수를 하나 생성.
        for(int i = 0; i < arr.length; i++) { // 배열 0~끝가지 반복
            if(arr[i] > avg) { // 만약 i번째에 해당하는 arr[i] 값이 매개변수로받은 평균을 넘으면
                count++; // count에 1을 더한다.
            }
        }

        double result = (double)count / arr.length * 100; // 연산하는 값들이 전부 int형이므로 하나를 double형으로 바꾸고 백분율을 표시하기위해 100을 곱한다. 
        return result;
    }
}