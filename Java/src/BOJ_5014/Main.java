package BOJ_5014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int F, S, G, U, D;
    static int[] visited;
    static int result = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Elevator> queue = new LinkedList<>();

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        visited = new int[F + 1];

        queue.add(new Elevator(S, 0));

        while (!queue.isEmpty()) {
            Elevator elevator = queue.poll();

            assert elevator != null;
            if (elevator.floor == G) {
                result = elevator.totalButton;
                break;
            }

            if (elevator.floor - D > 0 && visited[elevator.floor - D] == 0) {
                queue.add(new Elevator(elevator.floor - D, elevator.totalButton + 1));
                visited[elevator.floor - D] = 1;
            }

            if (elevator.floor + U <= F && visited[elevator.floor + U] == 0) {
                queue.add(new Elevator(elevator.floor + U, elevator.totalButton + 1));
                visited[elevator.floor + U] = 1;
            }
        }

        System.out.println((result != -1) ? result : "use the stairs");
    }
}

class Elevator {
    int floor;
    int totalButton;

    public Elevator(int floor, int totalButton) {
        this.floor = floor;
        this.totalButton = totalButton;
    }
}
