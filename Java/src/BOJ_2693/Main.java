package BOJ_2693;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            for (int j = 0; j < 2; j++) {
                queue.poll();
            }

            System.out.println(queue.poll());
        }
    }
}
