package BOJ_10809;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
		br.close();
		
		int alpabet[] = new int[26];

		for(int i = 0; i < alpabet.length; i++) { // 0~25 인덱스에 각각 -1을 넣어준다.(나중에 input_string으로 확인 할려고)
			alpabet[i] = -1;
		}
		
		char[] input_string = str.toCharArray(); // 입력받은 str을 한글자씩 나눠서 chr형 배열에 각각 집어넣는다.

		for(int j = 0; j < input_string.length; j++) {
			int temp = input_string[j] - 97; // char형 - int형은 int로 반환한다. -> 이 반환된 인덱스가 a~z중 하나의 주소로 해당됨.
			if(alpabet[temp] == -1) { // if를 써준이유는 각각 문자의 처음 등장하는 인덱스를 넣어야하는데 중복된 문자가 있으면 인덱스 값이 바뀔수 있기 때문
				alpabet[temp] = j;
			}
		}

		for(int k = 0; k < alpabet.length; k++) {
			System.out.print(alpabet[k] + " ");
		}
	}	
}