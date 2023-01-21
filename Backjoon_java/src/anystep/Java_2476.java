package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2476 {
    //주사위 게임
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int max = 0;

        for (int i = 0; i < N; i++) {
            int cost = 0;
            stk = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());
            int C = Integer.parseInt(stk.nextToken());

            if (A == B && B == C) {
                cost = 10000 + (A * 1000);
            } else if (A != B && B != C && A != C) {
                cost = Math.max(A, Math.max(B, C)) * 100;
            } else {
                if (A == B || A == C) {
                    cost = 1000 + (A * 100);
                } else {
                    cost = 1000 + (B * 100);
                }
            }
            if (cost > max) {
                max = cost;
            }
        }
        System.out.println(max);
    }
}
