package BOJ_2263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] inOrder = new int[100001],
            postOrder = new int[100001],
            index = new int[100001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
            index[inOrder[i]] = i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        getPreOrder(1, N, 1, N);

        System.out.println(sb);
    }

    public static void getPreOrder(int is, int ie, int ps, int pe) {
        if (ie < is || pe < ps) {
            return;
        }

        int rootIndex = index[postOrder[pe]];
        int leftSize = rootIndex - is;
        int rightSize = ie - rootIndex;
        sb.append(inOrder[rootIndex]).append(' ');

        getPreOrder(is, rootIndex - 1, ps, ps + leftSize - 1);
        getPreOrder(rootIndex + 1, ie, ps + leftSize, pe - 1);
    }
}