package BOJ_2447;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        String[] defaultStarArr = {"*"};
        String[] result = star(n, 1, defaultStarArr);
        for(String i : result) System.out.println(i);
    }

    public static String[] star(int starN, int checkN, String[] starArr) {
        if(starN == checkN) return starArr; // 재귀함수를 끝내기 위해 starN과 checkN 변수가 같으면 매개변수 문자열 배열을 반환한다.
        
        String[] result = new String[checkN * 3]; // 배열 초기화
        for(int i = 0; i < result.length; i++) result[i] = ""; // 배열의 모든값을 빈 값으로 통일.

        String blank = "";
        for(int k = 0; k < starArr[0].length(); k++) blank += " "; // 비어있는 문자열의 개수를 구하고 그 문자열을 저장.

        // row(열, 세로), col(행, 가로)
        
        for(int row = 0; row < starArr.length; row++) {
            for(int col = 0; col < 3; col++) result[row] += starArr[row]; // 각 i에 해당하는 인덱스의 starArr을 result[i]에 3번 곱해서 저장.
        }

        for(int row = starArr.length; row < (starArr.length * 2); row++) { // j가 1일때는 가운데 이므로 빈 문자열을 삽입.
            for(int col = 0; col < 3; col++){
                if(col == 1) result[row] += blank;
                else result[row] += starArr[row-starArr.length];
            }
        }

        for(int row = (starArr.length * 2); row < (starArr.length * 3); row++) {
            for(int col = 0; col < 3; col++) result[row] += starArr[row-starArr.length*2];
        }

         /* starArr배열의 길이를 2, 3곱한 이유는 비어있는 문자열을 판단하기 위해 범위를 구한것이다.
         별묶음을 한개라고 가정하고 총 9개의 별묶음으로 정사각형이 있다면 row, col(2, 2)가 비어있는 셀이다. */

        return star(starN, checkN * 3, result); // starN과 checkN이 같아질때 까지 재귀.
    }
}