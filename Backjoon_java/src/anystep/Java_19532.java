package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_19532 {
    //수학은 비대면강의입니다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int c = Integer.parseInt(stk.nextToken());
        int d = Integer.parseInt(stk.nextToken());
        int e = Integer.parseInt(stk.nextToken());
        int f = Integer.parseInt(stk.nextToken());
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}
