package BOJ_5430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Deque<Integer> deque = new LinkedList<>();
            // true : 앞, false : 뒤
            boolean location = true;
            String[] p = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            String command = br.readLine();
            String[] numbers = command.substring(1, command.length() - 1).split(",");

            for (int j = 0; j < n; j++) {
                deque.add(Integer.parseInt(numbers[j]));
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < p.length; j++) {
                if (p[j].equals("R")) {
                    location = !location;
                } else if (p[j].equals("D")) {
                    try {
                        if (location) {
                            deque.removeFirst();
                        } else {
                            deque.removeLast();
                        }
                    } catch (Exception e) {
                        sb.append("error");
                        break;
                    }
                }
            }

            if (sb.length() == 0 && command.length() > 2) {
                sb.append('[');
                while (!deque.isEmpty()) {
                    if (location) {
                        sb.append(deque.removeFirst());
                    } else {
                        sb.append(deque.removeLast());
                    }
                    sb.append(',');
                }
                if (sb.charAt(sb.length() - 1) == ',') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append(']');
            } else if (!sb.toString().equals("error") && command.length() == 2) {
                sb.append("[]");
            }

            System.out.println(sb);
        }
    }
}
