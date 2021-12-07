package BOJ_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String command = br.readLine();
            String result = "yes";

            if (command.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            char[] commandArray = command.toCharArray();

            for (int i = 0; i < commandArray.length; i++) {
                if (commandArray[i] == '(' || commandArray[i] == '[') {
                    stack.push(commandArray[i]);
                } else if (commandArray[i] == ')' || commandArray[i] == ']') {
                    if (stack.isEmpty()) {
                        stack.push('(');
                        break;
                    }
                    char temp = stack.peek();

                    if (temp == '(' && commandArray[i] == ')') {
                        stack.pop();
                    } else if (temp == '[' && commandArray[i] == ']') {
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) result = "no";

            System.out.println(result);
        }
    }
}
