package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14924 {
    //폰 노이만과 파리
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int S = Integer.parseInt(stk.nextToken());
        int T = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());
        System.out.println(D / (2 * S) * T);
    }
}
