package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5596 {
    //시험점수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int S, T;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < 4; i++) {
            S += Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < 4; i++) {
            T += Integer.parseInt(stk.nextToken());
        }
        System.out.println(Math.max(S, T));
    }
}
