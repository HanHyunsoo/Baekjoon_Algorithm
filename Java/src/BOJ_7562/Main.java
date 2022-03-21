package BOJ_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] moveY = {2, 1, -1, -2, -2, -1, 2, 1};
    static int[] moveX = {1, 2, 2, 1, -1, -2, -1, -2};

    public static boolean isValidIndex(int y, int x, int I) {
        return 0 <= y && y < I && 0 <= x && x < I;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int I = Integer.parseInt(br.readLine());
            int[][] visited = new int[I][I];
            Queue<Location> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            Location night = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
            queue.add(night);
            st = new StringTokenizer(br.readLine());
            int[] target = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            while (!queue.isEmpty()) {
                Location location = queue.poll();
                visited[location.y][location.x] = 1;

                if (location.y == target[0] && location.x == target[1]) {
                    System.out.println(location.depth);
                    break;
                }

                for (int j = 0; j < 8; j++) {
                    int ny = location.y + moveY[j];
                    int nx = location.x + moveX[j];

                    if (isValidIndex(ny, nx, I) && visited[ny][nx] != 1) {
                        queue.add(new Location(ny, nx, location.depth + 1));
                        visited[ny][nx] = 1;
                    }
                }
            }
        }
    }
}

class Location {
    int y, x, depth;

    public Location(int y, int x, int depth) {
        this.y = y;
        this.x = x;
        this.depth = depth;
    }
}
