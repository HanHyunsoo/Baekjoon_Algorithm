package BOJ_1167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Node {
    int v;
    int weight;

    public Node(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }
}

public class Main {

    static ArrayList<ArrayList<Node>> arrayList = new ArrayList<>();
    static int[] visited;
    static int result = 0;
    static int v, start;

    public static void dfs(int n, int count) {
        visited[n] = 1;

        if (result < count) {
            result = count;
            start = n;
        }

        ArrayList<Node> nodes = arrayList.get(n);
        for (Node node : nodes) {
            if (visited[node.v] == 0) {
                dfs(node.v, count + node.weight);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        v = Integer.parseInt(br.readLine());

        IntStream.range(0, v + 1).forEach(x -> arrayList.add(new ArrayList<>()));
        visited = new int[v + 1];
        for (int i = 0; i < v; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            while (true) {
                int t = Integer.parseInt(st.nextToken());
                if (t == -1) break;
                int w = Integer.parseInt(st.nextToken());

                ArrayList<Node> nodes = arrayList.get(n);
                nodes.add(new Node(t, w));
            }
        }

        dfs(1, 0);
        Arrays.fill(visited, 0);
        result = 0;

        dfs(start, 0);

        System.out.println(result);
    }
}
