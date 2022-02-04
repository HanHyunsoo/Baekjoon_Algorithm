package BOJ_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = N; i >= 1; i--) {
            list.add(arr[i], i);
        }

        StringBuilder sb = new StringBuilder();
        list.forEach(x -> sb.append(x).append(' '));

        System.out.println(sb);
    }
}
