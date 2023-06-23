package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_24082 {
    //Cube
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        double ans = Math.pow(N,3);
        System.out.println((int)ans);
    }
}
