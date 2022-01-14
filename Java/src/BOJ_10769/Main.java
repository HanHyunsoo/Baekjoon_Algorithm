package BOJ_10769;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();

        int smile = 0;
        int sad = 0;

        for (int i = 0; i < command.length() - 3; i++) {
            String temp = command.substring(i, i + 3);

            if (temp.equals(":-)")) {
                smile++;
            } else if (temp.equals(":-(")) {
                sad++;
            }
        }

        String result;

        if (smile > sad) {
            result = "happy";
        } else if (smile < sad) {
            result = "sad";
        } else if (smile != 0 && smile == sad) {
            result = "unsure";
        } else {
            result = "none";
        }

        System.out.println(result);
    }
}
