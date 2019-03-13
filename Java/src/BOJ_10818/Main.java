package BOJ_10818;
import java.util.Scanner;

public class Main {

    public static int max(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(result > arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int min(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        System.out.println(max(arr) + " " + min(arr));
    }
}