package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_20492 {
    //세금
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        double A = (N - (N * 0.22));
        double B = N * 0.8 + ((N * 0.2) - ((N * 0.2) * 0.22));
        System.out.println((int) A);
        System.out.println((int) B);
    }
}
