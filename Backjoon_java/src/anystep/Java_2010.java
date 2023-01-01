package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2010 {
    //플러그
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int ans = 0;
        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(in.readLine());
            ans += num;
        }
        System.out.println(ans - (N - 1));
    }
}
