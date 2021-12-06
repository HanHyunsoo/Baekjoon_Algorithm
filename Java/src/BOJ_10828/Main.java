package BOJ_10828;

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

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            String command = br.readLine();
            if (command.split(" ").length == 2) {

                String[] pushCommand = command.split(" ");
                stack.push(Integer.parseInt(pushCommand[1]));
            } else if (command.equals("pop")) {

                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (command.equals("size")) {

                System.out.println(stack.size());
            } else if (command.equals("empty")) {

                System.out.println(stack.isEmpty() ? 1 : 0);
            } else if (command.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());

            }
        }
    }
}
