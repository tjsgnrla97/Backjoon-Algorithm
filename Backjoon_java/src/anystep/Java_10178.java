package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10178 {
    //할로윈의 사탕
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {
            stk = new StringTokenizer(in.readLine());
            int c = Integer.parseInt(stk.nextToken());
            int v = Integer.parseInt(stk.nextToken());
            sb.append(String.format("You get %d piece(s) and your dad gets %d piece(s).\n", c / v, c % v));
        }
        System.out.print(sb);
    }
}
