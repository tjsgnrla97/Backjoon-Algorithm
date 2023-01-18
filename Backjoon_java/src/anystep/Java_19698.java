package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_19698 {
    //헛간 청약
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int W = Integer.parseInt(stk.nextToken());
        int H = Integer.parseInt(stk.nextToken());
        int L = Integer.parseInt(stk.nextToken());
        int ans = (W / L) * (H / L);
        if (ans >= N) System.out.println(N);
        else System.out.println(ans);
    }
}
