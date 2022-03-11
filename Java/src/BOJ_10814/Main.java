package BOJ_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] array = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }

        Arrays.sort(array, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        Arrays.stream(array).forEach(x -> System.out.println(x[0] + " " + x[1]));
    }
}