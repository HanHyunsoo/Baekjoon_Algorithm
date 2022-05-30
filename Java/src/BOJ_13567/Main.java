package BOJ_13567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 0: 우, 1: 상, 2: 좌, 3: 하
    static int direction = 0;
    static int x = 0;
    static int y = 0;
    static int M, n;

    public static void turn(int dir) {
        direction += (dir == 0) ? 1 : -1;

        if (direction > 3) {
            direction = 0;
        } else if (direction < 0) {
            direction = 3;
        }
    }

    public static void move(int d) {
        // 좌우 일때
        if (direction == 0 || direction == 2) {
            x += (direction == 0) ? d : -d;
        // 상하 일때
        } else {
            y += (direction == 1) ? d : -d;
        }
    }

    public static boolean isValid() {
        return !(x < 0 || x > M || y < 0 || y > M);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            if (st.nextToken().equals("MOVE")) {
                move(Integer.parseInt(st.nextToken()));
            } else {
                turn(Integer.parseInt(st.nextToken()));
            }

            if (!isValid()) break;
        }

        if (isValid()) {
            System.out.println(x + " " + y);
        } else {
            System.out.println(-1);
        }
    }
}
