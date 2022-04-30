package BOJ_6487;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static String getIntersectionPoint(Point A, Point B, Point C, Point D) {
        String result = "";
        Line AB = new Line(A, B);
        Line CD = new Line(C, D);
        double Px, Py;

        // 둘다 정상적인 일차방정식이면
        if (AB.isParallel && CD.isParallel) {
            // 기울기가 같으면
            if (AB.m == CD.m) {
                // 상수가 같으면
                if (AB.equals(CD)) {
                    result = "LINE";
                // 상수가 다르면
                } else {
                    result = "NONE";
                }
            // 기울기가 다르면
            } else {
                Px = -((AB.b - CD.b) / (AB.m - CD.m));
                Py = AB.m * Px + AB.b;

                result = String.format("POINT %.2f %.2f", Px, Py);
            }
        // 둘 중 하나가 절편이라면
        } else if (AB.isParallel && CD.isIntercept() || AB.isIntercept() && CD.isParallel) {
            // CD가 절편이면
            if (AB.isParallel) {
                // x절편이면
                if (CD.isXIntercept) {
                    Px = CD.x;
                    Py = AB.m * Px + AB.b;
                // y절편이면
                } else {
                    Py = CD.y;
                    Px = (Py - AB.b) / AB.m;
                }
            // AB가 절편이면
            } else {
                // x절편이면
                if (AB.isXIntercept) {
                    Px = AB.x;
                    Py = CD.m * Px + CD.b;
                // y절편이면
                } else {
                    Py = AB.y;
                    Px = (Py - CD.b) / CD.m;
                }
            }

            result = String.format("POINT %.2f %.2f", Px, Py);

        // 둘다 절편이면
        } else if (AB.isIntercept() && CD.isIntercept()) {
            // 둘다 같은 축 절편이면
            if (AB.isXIntercept && CD.isXIntercept || AB.isYIntercept && CD.isYIntercept) {
                boolean isSame;

                // x절편 이면 상수가 같나 확인
                if (AB.isXIntercept) {
                    isSame = AB.x == CD.x;
                // y절편 이면 상수가 같나 확인
                } else {
                    isSame = AB.y == CD.y;
                }

                result = isSame ? "LINE" : "NONE";
            // 둘다 다른 축 절편이면
            } else {
                // AB가 x, CD가 y 절편이면
                if (AB.isXIntercept) {
                    Px = AB.x;
                    Py = CD.y;
                // AB가 y, CD가 x 절편이면
                } else {
                    Px = CD.x;
                    Py = AB.y;
                }

                result = String.format("POINT %.2f %.2f", Px, Py);
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Point A = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Point B = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Point C = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            Point D = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            System.out.println(getIntersectionPoint(A, B, C, D));
        }
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {

    // y = mx + b;
    int y = 0;
    int x = 0;
    double m = 0.0;
    double b = 0.0;
    boolean isXIntercept = false;
    boolean isYIntercept = false;
    boolean isParallel = true;

    public Line(Point A, Point B) {
        if (A.x == B.x) {
            this.x = A.x;
            isXIntercept = true;
            isParallel = false;
        } else if (A.y == B.y) {
            this.y = A.y;
            isYIntercept = true;
            isParallel = false;
        } else {
            this.m = (B.y - A.y) / (double) (B.x - A.x);
            this.b = A.y - (m * A.x);
        }
    }

    // 절편인지 확인하는 메소드
    public boolean isIntercept() {
        return isXIntercept || isYIntercept;
    }

    public boolean equals(Line o) {
        return x == o.x && y == o.y && m == o.m && b == o.b;
    }
}