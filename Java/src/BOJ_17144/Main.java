package BOJ_17144;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[][] inputTable = new int[r][c];
        for(int i = 0; i < r; i++) {
            String[] inputRow = br.readLine().split(" ");
            for(int j = 0; j < c; j++) {
                inputTable[i][j] = Integer.parseInt(inputRow[j]);
            }
        }
        br.close();

        FineDustTable Table = new FineDustTable(r, c, t, inputTable);
        Table.runTable();
    }
}

class FineDustTable {
    // 값이 변하지 않으므로 private, final
    private final int r, c, t;
    private final int[] AirCleanerIndex;
    // 외부 클래스에서 변경 못함.
    private int[][] table;
    
    public FineDustTable(int r, int c, int t, int[][] table) {
        this.r = r;
        this.c = c;
        this.t = t;
        this.table = table;
        this.AirCleanerIndex = checkAirCleanerIndex();
    }
    
     // -1(공기청정기)가 있는 인덱스를 반환하는 함수.
    private int[] checkAirCleanerIndex() {
        int[] result = null;

        // [0]은 위, [1]은 아래
        for(int i = 0; i < r; i++) {
            if(table[i][0] != -1) continue;
            else {
                result = new int[]{i, i + 1};
                break;
            }
        }
        
        return result;
    }

    // // 테이블을 출력하는 함수
    // public void showTable() {
    //     for(int i = 0; i < r; i++) {
    //         for(int j = 0; j < c; j++) {
    //             System.out.print(table[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // 위, 아래, 왼쪽, 오른쪽 칸에 확산될 수 있는지 논리 배열을 반환하는 함수
    private boolean[] checkEmptySpace(int rCurrent, int cCurrent) {
        // index = 0:위, 1:아래, 2:왼쪽, 3:오른쪽
        boolean[] checkAround = {false, false, false, false};
        // 해당 셀을 5로 나눠서 1미만이 나오면 확산이 안된다.
        if(table[rCurrent][cCurrent] / 5 < 1) return checkAround;

        if(rCurrent - 1 >= 0 && table[rCurrent - 1][cCurrent] != -1) {
            checkAround[0] = true;
        }
        if(rCurrent + 1 < r && table[rCurrent + 1][cCurrent] != -1) {
            checkAround[1] = true;
        }
        if(cCurrent - 1 >= 0 && table[rCurrent][cCurrent - 1] != -1) {
            checkAround[2] = true;
        }
        if(cCurrent + 1 < c && table[rCurrent][cCurrent + 1] != -1) {
            checkAround[3] = true;
        }

        return checkAround;
    }

    // 칸을 한개씩 돌면서 주위에 미세먼지를 확산하는 함수.
    private void fineDustDiffusion() {
        int[][] resultTable = new int[r][c]; // 원래의 배열 복사(-1만 그대로 나머지 0)
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(table[i][j] == -1) {
                    resultTable[i][j] = -1;
                } 
                else {
                    resultTable[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(table[i][j] == 0 || table[i][j] == -1) continue; // 0이나 -1이면 넘어간다

                int diffusionCount = 0;
                int diffusionAmount = table[i][j] / 5;
                boolean[] checkAroundNow = checkEmptySpace(i, j);
                
                if(checkAroundNow[0]) {
                    resultTable[i - 1][j] += diffusionAmount;
                    diffusionCount++;
                }
                if(checkAroundNow[1]) {
                    resultTable[i + 1][j] += diffusionAmount;
                    diffusionCount++;
                }
                if(checkAroundNow[2]) {
                    resultTable[i][j - 1] += diffusionAmount;
                    diffusionCount++;
                }
                if(checkAroundNow[3]) {
                    resultTable[i][j + 1] += diffusionAmount;
                    diffusionCount++;
                }

                resultTable[i][j] += table[i][j] - diffusionAmount * diffusionCount; 
            }
        }

        this.table = resultTable;
    }

    // 위에있는 공기청정기 작동 시키기
    private void activateUpAirCleaner() {
        for(int i = AirCleanerIndex[0]; i > 0; i--) {
            table[i][0] = table[i - 1][0];
        }

        for(int j = 0; j < c - 1; j++) {
            table[0][j] = table[0][j + 1];
        }

        for(int k = 0; k < AirCleanerIndex[0]; k++) {
            table[k][c - 1] = table[k + 1][c - 1];
        }

        for(int v = c - 1; v > 1; v--) {
            table[AirCleanerIndex[0]][v] = table[AirCleanerIndex[0]][v - 1];
        }

        table[AirCleanerIndex[0]][0] = -1;
        table[AirCleanerIndex[0]][1] = 0;
    }

    // 아래에있는 공기청정기 작동 시키기
    private void activateDownAirCleaner() {
        for(int i = AirCleanerIndex[1]; i < r - 1; i++) {
            table[i][0] = table[i + 1][0];
        }

        for(int j = 0; j < c - 1; j++) {
            table[r - 1][j] = table[r - 1][j + 1];
        }

        for(int k = r - 1; k > AirCleanerIndex[1] - 1; k--) {
            table[k][c - 1] = table[k - 1][c - 1];
        }

        for(int v = c - 1; v > 1; v--) {
            table[AirCleanerIndex[1]][v] = table[AirCleanerIndex[1]][v - 1];
        }

        table[AirCleanerIndex[1]][0] = -1;
        table[AirCleanerIndex[1]][1] = 0;
    }

    // t만큼 돌리고 합 출력하기.
    public void runTable() {
        for(int i = 0; i < t; i++) {
            fineDustDiffusion();
            activateUpAirCleaner();
            activateDownAirCleaner();
        }

        int result = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(table[i][j] > 0) result += table[i][j];
            }
        }

        System.out.println(result);
    }
}