package BOJ_1357;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int rev(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(number);

        sb.reverse();

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(rev(rev(a) + rev(b)));
    }
}
