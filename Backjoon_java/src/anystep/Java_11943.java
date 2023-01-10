package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11943 {
    //파일 옮기기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int C = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());
        System.out.println(Math.min(A + D, B + C));
    }
}
