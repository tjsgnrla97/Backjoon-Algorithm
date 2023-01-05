package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_15894 {
    //수학은 체육과목 입니다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BigInteger N = new BigInteger(in.readLine());
        System.out.println(N.multiply(BigInteger.valueOf(4)));
    }
}
