package BOJ_1085;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        scan.close();

        int[] boundary = {x, y, w - x, h - y};

        int min = boundary[0];
        
        for(int i = 1; i < boundary.length; i++) {
            if (boundary[i] < min) {
                min = boundary[i];
            }
        }

        System.out.println(min);
    }
}