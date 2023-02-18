package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15351 {
    //인생 점수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int score = 0;
            String life = in.readLine().replaceAll(" ", "");
            for (int i = 0; i < life.length(); i++) {
                score += life.charAt(i) - 64;
            }
            if (score == 100) {
                System.out.println("PERFECT LIFE");
            } else {
                System.out.println(score);
            }
        }
    }
}
