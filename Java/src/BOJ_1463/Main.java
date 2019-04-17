package BOJ_1463;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(Integer.parseInt(br.readLine()));

        int count = 0;
        while(true) {
            if(numbers.get(0) == 1) {
                System.out.println(count);
                break;
            }

            numbers = makeOne(numbers);
            count++;
            if(numbers.contains(1)) {
                System.out.println(count);
                break;
            }
        }
    }

    public static ArrayList<Integer> makeOne(ArrayList<Integer> numbers) {
        ArrayList<Integer> returnResult = new ArrayList<Integer>();

        for(int number : numbers) {
            returnResult.add(number - 1);
            if(number % 3 == 0) {
                returnResult.add(number / 3);
            } else if(number % 2 == 0) {
                returnResult.add(number / 2);
            }
        }

        return returnResult;
    }
}