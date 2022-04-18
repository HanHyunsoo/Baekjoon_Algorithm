package BOJ_2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static int[][] map = new int[5][5];
    static HashMap<Integer, int[]> hashMap = new HashMap<>();
    static int count;

    public static boolean check() {
        int bingoCount = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            for (int j = 0; j < 5; j++) {
                temp += (map[i][j] == 1) ? 1 : 0;
            }
            bingoCount += (temp == 5) ? 1 : 0;
        }

        // 세로 체크
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            for (int j = 0; j < 5; j++) {
                temp += (map[j][i] == 1) ? 1 : 0;
            }
            bingoCount += (temp == 5) ? 1 : 0;
        }

        // 대각선 체크
        int diagonalOne = 0;
        int diagonalTwo = 0;
        for (int i = 0; i < 5; i++) {
            diagonalOne += (map[i][i] == 1) ? 1 : 0;
            diagonalTwo += (map[4 - i][i] == 1) ? 1 : 0;
        }

        bingoCount += (diagonalOne == 5) ? 1 : 0;
        bingoCount += (diagonalTwo == 5) ? 1 : 0;

        count++;
        return bingoCount >= 3;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                hashMap.put(Integer.parseInt(st.nextToken()), new int[]{i, j});
            }
        }

        Loop:
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int[] p = hashMap.get(Integer.parseInt(st.nextToken()));
                map[p[0]][p[1]] = 1;

                if (check()) {
                    System.out.println(count);
                    break Loop;
                }
            }
        }
    }
}
