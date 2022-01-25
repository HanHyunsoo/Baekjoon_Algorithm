package BOJ_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(upperBound(arr, temp) - lowerBound(arr, temp)).append(' ');
        }

        System.out.println(sb);
    }

    public static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (target <= arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
