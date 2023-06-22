package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5361 {
    //전투 드로이드 가격
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            stk = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());
            int C = Integer.parseInt(stk.nextToken());
            int D = Integer.parseInt(stk.nextToken());
            int E = Integer.parseInt(stk.nextToken());
            System.out.println("$" + (String.format("%.2f", (A * 350.34 + B * 230.90 + C * 190.55 + D * 125.30 + E * 180.90))));
        }
    }
}
