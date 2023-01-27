package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1964 {
    //오각형, 오각형, 오각형…
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int mod = 45678;
        int ans = 5;
        for (int i = 1; i < N; i++) {
            ans = (ans + (i + 2) * 3 - 2) % mod;
        }
        System.out.println(ans);
    }
}
