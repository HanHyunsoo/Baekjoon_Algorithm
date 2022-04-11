package BOJ_10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            priorityQueue.add(new Student(name, korean, english, math));
        }

        StringBuilder sb = new StringBuilder();

        while (!priorityQueue.isEmpty()) {
            sb.append(priorityQueue.poll().name).append('\n');
        }

        System.out.println(sb);
    }
}

class Student implements Comparable<Student> {

    String name;
    int korean, english, math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Student o) {
        if (korean == o.korean) {
            if (english == o.english) {
                if (math == o.math) {
                    return name.compareTo(o.name);
                }
                return o.math - math;
            }
            return english - o.english;
        }
        return o.korean - korean;
    }
}