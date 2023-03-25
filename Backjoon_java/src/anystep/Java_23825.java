package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_23825 {
    //SASA 모형을 만들어보자
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        N /= 2;
        M /= 2;
        int ans = Math.min(N, M);
        System.out.println(ans);
    }
}
