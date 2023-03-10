package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25314 {
    //코딩은 체육과목 입니다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        N /= 4;
        for (int i = 0; i < N; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
