package BOJ_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(List.of(N, 0));

        while (!queue.isEmpty()) {
            int temp = queue.peek().get(0);
            int depth = queue.peek().get(1);
            queue.poll();

            if (temp == K) {
                System.out.println(depth);
                break;
            }

            if (visited[temp] == 0) {
                visited[temp] = 1;

                if (isValid(temp + 1)) {
                    queue.add(List.of(temp + 1, depth + 1));
                }

                if (isValid(temp - 1)) {
                    queue.add(List.of(temp - 1, depth + 1));
                }

                if (isValid(temp * 2)) {
                    queue.add(List.of(temp * 2, depth + 1));
                }

            }
        }
    }

    static boolean isValid(int n) {
        return n >= 0 && n <= 100000;
    }
}
