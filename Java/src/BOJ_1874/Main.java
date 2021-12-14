package BOJ_1874;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int max = 1;
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (value >= max) {
                for (int j = max; j <= value; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
                max = value + 1;

            } else if (!stack.isEmpty() && stack.peek() == value) {
                stack.pop();
                sb.append("-\n");

            } else if (stack.peek() != value) {
                sb = new StringBuilder("NO");
                break;
            }
        }

        System.out.println(sb);
    }
}
