package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_27966 {
    //삼각형
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Long N = Long.parseLong(in.readLine());
        Long ans = N - 1 + (N - 2) * (N - 1);
        System.out.println(ans);
        for (long i = 2; i <= N; i++) {
            System.out.println("1 " + i);
        }
    }
}
