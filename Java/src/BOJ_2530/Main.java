package BOJ_2530;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LocalTime time = LocalTime.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        time = time.plusSeconds(Long.parseLong(br.readLine()));

        System.out.printf("%d %d %d", time.getHour(), time.getMinute(), time.getSecond());
    }
}
