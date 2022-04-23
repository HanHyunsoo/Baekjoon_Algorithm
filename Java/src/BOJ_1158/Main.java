package BOJ_1158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        IntStream.range(1, N + 1).forEach(queue::add);

        List<Integer> list = new LinkedList<>();

        int count = 0;
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            count++;

            if (count == K) {
                list.add(temp);
                count = 0;
            } else {
                queue.add(temp);
            }
        }

        System.out.println(list.toString().replace('[', '<').replace(']', '>'));
    }
}
