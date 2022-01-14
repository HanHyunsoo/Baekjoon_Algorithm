package BOJ_12605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            Stack<String> stack = new Stack<>();
            stack.addAll(List.of(command));

            System.out.print("Case #" + (i + 1) + ":");

            while (!stack.isEmpty()) {
                System.out.print(" " + stack.pop());
            }
            System.out.println();
        }
    }
}
