package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11382 {
    //꼬마 정민
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        long ans = 0;
        while (stk.hasMoreTokens()) {
            ans += Long.parseLong(stk.nextToken());
        }
        System.out.println(ans);
    }
}
