package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10821 {
    //정수의 개수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine(),",");
        System.out.println(stk.countTokens());
    }
}
