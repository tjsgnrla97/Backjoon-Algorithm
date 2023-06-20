package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_22193 {
    //Multiply
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String temp = in.readLine();
        BigInteger A = new BigInteger(in.readLine());
        BigInteger B = new BigInteger(in.readLine());
        System.out.println(A.multiply(B));
    }
}
