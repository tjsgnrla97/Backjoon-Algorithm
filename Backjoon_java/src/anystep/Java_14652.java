package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14652 {
    //나는 행복합니다~
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        System.out.println(K / M + " " + K % M);
    }
}
