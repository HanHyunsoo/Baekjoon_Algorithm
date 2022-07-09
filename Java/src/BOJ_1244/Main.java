package BOJ_1244;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int switchCount;
    static int[] switches;

    public static void setSwitchesByMale(int number) {
        for (int i = 1; i * number <= switchCount; i++) {
            switches[i * number] = (switches[i * number] == 1) ? 0 : 1;
        }
    }

    public static void setSwitchesByFemale(int number) {
        switches[number] = (switches[number] == 1) ? 0 : 1;
        int a = number - 1;
        int b = number + 1;
        while (isIndexValid(a, b)) {
            switches[a] = (switches[a] == 1) ? 0 : 1;
            switches[b] = (switches[b] == 1) ? 0 : 1;
            a--;
            b++;
        }
    }

    public static boolean isIndexValid(int a, int b) {
        if (a < 1 || b > switchCount) return false;
        return switches[a] == switches[b];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        switchCount = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        switches = new int[switchCount + 1];

        for (int i = 1; i <= switchCount; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            if (sex == 1) {
                setSwitchesByMale(Integer.parseInt(st.nextToken()));
            } else {
                setSwitchesByFemale(Integer.parseInt(st.nextToken()));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < switches.length; i++) {
            sb.append(switches[i]).append(" ");
            if (i % 20 == 0) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append('\n');
            }
        }

        System.out.println(sb.toString().trim());
    }
}
