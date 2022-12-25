package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1267 {
    //핸드폰 요금
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int K;
        int Y = 0, M = 0;
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            K = Integer.parseInt(stk.nextToken());
            Y += ((K / 30) + 1) * 10;
            M += ((K / 60) + 1) * 15;
        }
        if (Y == M) {
            System.out.println("Y M " + Y);
        } else if (Y < M) {
            System.out.println("Y " + Y);
        } else {
            System.out.println("M " + M);
        }
    }
}
