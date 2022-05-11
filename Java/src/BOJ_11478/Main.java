package BOJ_11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < str.length(); j++) {
                sb.append(str, j, j + 1);
                set.add(sb.toString());
            }
        }

        System.out.println(set.size());
    }
}
