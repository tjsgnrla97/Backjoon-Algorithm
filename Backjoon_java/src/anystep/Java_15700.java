package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15700 {
    //타일 채우기 4
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        long N = Long.parseLong(stk.nextToken());
        long M = Long.parseLong(stk.nextToken());

        System.out.println((N * M) / 2);
    }
}
