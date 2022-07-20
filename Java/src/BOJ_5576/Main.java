package BOJ_5576;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> wPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> kPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < 10; i++) {
            wPriorityQueue.add(sc.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            kPriorityQueue.add(sc.nextInt());
        }

        int wScore = 0;
        int kScore = 0;

        for (int i = 0; i < 3; i++) {
            wScore += wPriorityQueue.poll();
            kScore += kPriorityQueue.poll();
        }

        System.out.println(wScore + " " + kScore);
    }
}
