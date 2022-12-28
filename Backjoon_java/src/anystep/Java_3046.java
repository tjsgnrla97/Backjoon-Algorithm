package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3046 {
    //R2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int R1 = Integer.parseInt(stk.nextToken());
        int S = Integer.parseInt(stk.nextToken());
        System.out.println((S * 2) - R1);
    }
}
