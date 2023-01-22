package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_14928 {
    //큰 수 (BIG)
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String num = in.readLine();
        long temp = 0;
        for (int i = 0; i < num.length(); i++) {
            temp = (temp * 10 + (num.charAt(i) - '0')) % 20000303;
        }

        System.out.println(temp);
    }
}
