package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15680 {
    //연세대학교
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        System.out.println(N == 0 ? "YONSEI" : "Leading the Way to the Future");
    }
}
