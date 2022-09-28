package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10824 {
    //네 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        String A = stk.nextToken();
        String B = stk.nextToken();
        String C = stk.nextToken();
        String D = stk.nextToken();
        long sum1 = Long.parseLong(A+B);
        long sum2 = Long.parseLong(C+D);
        System.out.println(sum1+sum2);
    }
}
