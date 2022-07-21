package BOJ_2303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Person implements Comparable<Person> {
        int number;
        int value;

        public Person(int number, int value) {
            this.number = number;
            this.value = value;
        }

        @Override
        public int compareTo(Person o) {
            if (value == o.value) {
                return o.number - number;
            }
            return o.value - value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] cards = new int[5];

            for (int j = 0; j < 5; j++) {
                cards[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;

            for (int j = 0; j < 3; j++) {
                for (int k = j + 1; k < 4; k++) {
                    for (int l = k + 1; l < 5; l++) {
                        int a = (cards[j] + cards[k] + cards[l]) % 10;

                        max = Math.max(max, (cards[j] + cards[k] + cards[l]) % 10);
                    }
                }
            }

            priorityQueue.add(new Person(i, max));
        }

        System.out.println(priorityQueue.poll().number);
    }
}
