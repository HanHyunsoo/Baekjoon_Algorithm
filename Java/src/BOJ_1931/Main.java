package BOJ_1931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Time> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list.add(new Time(start, end));
        }

        Collections.sort(list);

        int result = 0;
        int lastEndTime = 0;

        for (Time time : list) {
            if (lastEndTime <= time.start) {
                lastEndTime = time.end;
                result++;
            }
        }

        System.out.println(result);
    }
}

class Time implements Comparable<Time> {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        if (end == o.end) {
            return start - o.start;
        }
        return end - o.end;
    }
}
