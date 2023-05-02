package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_1252 {
    //이진수 덧셈
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        String A = stk.nextToken();
        String B = stk.nextToken();

        BigInteger A_binary = new BigInteger(A, 2);
        BigInteger B_binary = new BigInteger(B, 2);

        BigInteger sum = A_binary.add(B_binary);

        String ans = sum.toString(2);

        System.out.println(ans);
    }
}
