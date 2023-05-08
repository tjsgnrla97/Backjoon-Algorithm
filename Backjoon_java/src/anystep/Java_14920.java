package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14920 {
    //3n+1 수열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int ans = 0;
        while (true) {
            if (N == 1) break;
            if (N % 2 == 0) {
                N /= 2;
                ans++;
            } else if (N % 2 != 0) {
                N = N * 3 + 1;
                ans++;
            }
        }
        System.out.println(ans + 1);
    }
}
