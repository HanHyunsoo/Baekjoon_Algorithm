package BOJ_9934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static String[] inOrder;
    static String[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        inOrder = br.readLine().split(" ");
        result = new String[K];
        Arrays.fill(result, "");

        getTree(inOrder.length / 2, 0, inOrder.length - 1, 0);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static void getTree(int rootIndex, int p, int q, int level) {
        result[level] += inOrder[rootIndex] + " ";

        if (p == q) {
            return;
        }

        int leftChildIndex = (p + rootIndex - 1) / 2;
        int rightChildIndex = (rootIndex + 1 + q) / 2;

        getTree(leftChildIndex, p, rootIndex - 1, level + 1);
        getTree(rightChildIndex, rootIndex + 1, q, level + 1);
    }
}
