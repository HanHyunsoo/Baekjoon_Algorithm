package BOJ_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        String[] array = set.toArray(new String[0]);

        Arrays.sort(array, Comparator.comparingInt(String::length));

        for (String str : array) {
            System.out.println(str);
        }
    }
}
