package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10214 {
    //Baseball
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int Y = 0;
            int K = 0;
            for (int i = 1; i <= 9; i++) {
                stk = new StringTokenizer(in.readLine());
                Y += Integer.parseInt(stk.nextToken());
                K += Integer.parseInt(stk.nextToken());
            }
            if (Y > K) System.out.println("Yonsei");
            else if (Y < K) System.out.println("Korea");
            else System.out.println("Draw");
        }
    }
}
