package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_15740 {
    //A+B-9
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        BigInteger A = new BigInteger(stk.nextToken());
        BigInteger B = new BigInteger(stk.nextToken());
        System.out.println(A.add(B));
    }
}
