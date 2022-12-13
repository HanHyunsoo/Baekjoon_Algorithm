package BOJ_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static boolean[] check;
    static List<Integer> values = new ArrayList<>();
    static List<Character> operators = new ArrayList<>();
    static long max = Long.MIN_VALUE;
    static long min = Long.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        check = new boolean[n - 1];
        while (st.hasMoreTokens()) {
            values.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        addOperators(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        dfs(1, values.get(0));
        System.out.println(max + "\n" + min);
    }

    public static void dfs(int depth, long value) {
        if (depth == n) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            return;
        }

        for (int i = 0; i < operators.size(); i++) {
            if (check[i]) continue;
            check[i] = true;
            dfs(depth + 1, calculate(value, values.get(depth), operators.get(i)));
            check[i] = false;
        }
    }

    public static void addOperators(int addCount, int subCount, int mulCount, int divCount) {
        for (int i = 0; i < addCount; i++) {
            operators.add('+');
        }

        for (int i = 0; i < subCount; i++) {
            operators.add('-');
        }

        for (int i = 0; i < mulCount; i++) {
            operators.add('*');
        }

        for (int i = 0; i < divCount; i++) {
            operators.add('/');
        }
    }

    public static long calculate(long a, long b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return a / b;
        }
    }
}
