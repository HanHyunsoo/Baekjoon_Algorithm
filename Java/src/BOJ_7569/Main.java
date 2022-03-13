package BOJ_7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int M, N, H;
    static int maxTomato;
    static int totalTomato = 0;
    static int countDay = 0;
    static Queue<Location> queue = new LinkedList<>();
    static int[][][] map;
    static int[] moveX = {0, 0, 1, 0, -1, 0};
    static int[] moveY = {0, 0, 0, 1, 0, -1};
    static int[] moveZ = {1, -1, 0, 0, 0, 0};

    public static void fillTomato(int z, int y, int x) {
        for (int i = 0; i < 6; i++) {
            int nz = z + moveZ[i];
            int ny = y + moveY[i];
            int nx = x + moveX[i];

            if (0 <= nz && nz < H &&
                0 <= ny && ny < N &&
                0 <= nx && nx < M) {
                if (map[nz][ny][nx] != 0) continue;
                queue.add(new Location(nz, ny, nx));
                map[nz][ny][nx] = 1;
                totalTomato++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][N][M];
        maxTomato = M * N * H;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    int temp = Integer.parseInt(st.nextToken());

                    if (temp != 0) {

                        if (temp == 1) {
                            totalTomato++;
                            queue.add(new Location(i, j, k));
                        } else {
                            maxTomato--;
                        }

                        map[i][j][k] = temp;
                    }
                }
            }
        }

        while (maxTomato != totalTomato) {
            int tempTotal = totalTomato;
            List<Location> locations = new ArrayList<>();

            while (!queue.isEmpty()) {
                locations.add(queue.poll());
            }

            locations.forEach(x -> fillTomato(x.z, x.y, x.x));

            if (totalTomato == tempTotal) {
                countDay = -1;
                break;
            }

            countDay++;
        }

        System.out.println(countDay);
    }
}

class Location {
    int z, y, x;

    public Location(int z, int y, int x) {
        this.z = z;
        this.y = y;
        this.x = x;
    }
}
