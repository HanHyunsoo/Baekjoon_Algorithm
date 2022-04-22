package BOJ_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    static class Point implements Comparable<Point> {
        int value;
        int index;

        public Point(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Point o) {
            if (value > o.value) {
                return 1;
            } else if (value == o.value) {
                return 0;
            }
            return -1;
        }
    }

    static int count = -1;
    static int[] compressValues;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        compressValues = new int[N];
        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            priorityQueue.add(new Point(Integer.parseInt(st.nextToken()), i));
        }

        Integer temp = null;

        while (!priorityQueue.isEmpty()) {
            Point point = priorityQueue.poll();

            if (temp == null || temp != point.value) {
                count++;
            }
            compressValues[point.index] = count;
            temp = point.value;
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(compressValues).forEach(x -> sb.append(x).append(' '));
        System.out.println(sb);
    }
}


