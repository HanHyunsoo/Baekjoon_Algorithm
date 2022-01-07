package BOJ_17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        boolean inout = false;

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == '<') {
                inout = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(temp);

            } else if (temp == '>') {
                inout = false;
                sb.append(temp);

            } else if (inout) {
                sb.append(temp);

            } else {
                if (temp == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }

                    sb.append(temp);
                } else {
                    stack.push(temp);
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}
