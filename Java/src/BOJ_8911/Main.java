package BOJ_8911;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] directionX = {0, 1, 0, -1};
        int[] directionY = {1, 0, -1, 0};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int dIndex = 0;
            int x = 0;
            int y = 0;
            int maxX = 0;
            int maxY = 0;
            int minX = 0;
            int minY = 0;
            
            String command = br.readLine();

            for (int j = 0; j < command.length(); j++) {
                char temp = command.charAt(j);

                switch (temp) {
                    case 'F':
                        x += directionX[dIndex];
                        y += directionY[dIndex];
                        break;
                    case 'B':
                        x -= directionX[dIndex];
                        y -= directionY[dIndex];
                        break;
                    case 'L':
                        dIndex--;
                        if (dIndex < 0) dIndex += 4;
                        break;
                    case 'R':
                        dIndex++;
                        dIndex %= 4;
                        break;
                }

                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
            }
            System.out.println((maxX - minX) * (maxY - minY));
        }
    }
}
