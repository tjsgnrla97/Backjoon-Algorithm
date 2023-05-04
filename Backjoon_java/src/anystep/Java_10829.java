package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_10829 {
    //이진수 변환
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        BigInteger N = new BigInteger(in.readLine());
        String ans = N.toString(2);
        System.out.println(ans);
    }
}
