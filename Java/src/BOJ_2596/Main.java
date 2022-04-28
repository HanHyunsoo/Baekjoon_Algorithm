package BOJ_2596;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    static Map<String, Character> map = new HashMap<>();

    public static void main(String[] args) throws IOException {

        map.put("000000", 'A');
        map.put("001111", 'B');
        map.put("010011", 'C');
        map.put("011100", 'D');
        map.put("100110", 'E');
        map.put("101001", 'F');
        map.put("110101", 'G');
        map.put("111010", 'H');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i += 6) {
            String sub = input.substring(i, i + 6);
            sub = check(sub);
            if (sub == null) {
                answer = new StringBuilder(String.valueOf(i / 6 + 1));
                break;
            }
            Character ch = map.get(sub);

            answer.append(ch);
        }

        System.out.println(answer);
    }
    
    public static String check(String sub) {
        StringBuilder sb, sb2;

        for (int i = 0; i < 6; i++) {
            sb = new StringBuilder(sub);
            sb2 = new StringBuilder(sub);
            sb.setCharAt(i, '1');
            sb2.setCharAt(i, '0');

            if (map.containsKey(sb.toString())) {
                return sb.toString();
            } else if (map.containsKey(sb2.toString())) {
                return sb2.toString();
            }
        }

        return null;
    }
}
