package BOJ_17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];

            while (!stack.isEmpty() && stack.peek() <= temp) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }
            stack.push(temp);
        }

        for (int i : answer) {
            sb.append(i + " ");
        }

        System.out.println(sb.toString());
    }
}
