package BOJ_2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        boolean isEven = true;

        while (queue.size() != 1) {
            if (isEven) {
                queue.remove();
            } else {
                queue.add(queue.remove());
            }
            isEven = !isEven;
        }

        System.out.println(queue.remove());
    }
}
