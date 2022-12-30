package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5717 {
    //상근이의 친구들
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            stk = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());
            if (A == 0 && B == 0) break;
            System.out.println(A + B);
        }
    }
}
