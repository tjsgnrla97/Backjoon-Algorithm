package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_24723 {
    //녹색거탑
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        System.out.println((int) Math.pow(2, N));
    }
}
