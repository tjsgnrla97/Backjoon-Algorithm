package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17496 {
    //스타후르츠
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int T = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());
        int P = Integer.parseInt(stk.nextToken());
        System.out.println((N - 1) / T * C * P);
    }
}
