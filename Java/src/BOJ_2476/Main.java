package BOJ_2476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sameCount = 0;
            int sameValue = 0;
            int result;

            for (int j = 0; j < 3; j++) {
                int value = Integer.parseInt(st.nextToken());

                if (set.contains(value) || set.isEmpty()) {
                    sameCount++;
                    sameValue = value;
                }
                set.add(value);
            }

            if (sameCount == 3) {
                result = 10000 + sameValue * 1000;
            } else if (sameCount == 2) {
                result = 1000 + sameValue * 100;
            } else {
                result = set.stream().max(Integer::compareTo).get() * 100;
            }

            answer = Math.max(answer, result);
        }

        System.out.println(answer);
    }
}
