package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_24265 {
    //알고리즘 수업 - 알고리즘의 수행 시간 4
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        long N = Integer.parseInt(in.readLine());
        System.out.println(N * (N - 1) / 2);
        System.out.print(2);
    }
}
