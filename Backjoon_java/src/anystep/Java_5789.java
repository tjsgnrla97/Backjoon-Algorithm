package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5789 {
    //한다 안한다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        while (N-- > 0) {
            String cur = in.readLine();
            sb.append(cur.charAt(cur.length() / 2 - 1) == cur.charAt(cur.length() / 2) ? "Do-it" : "Do-it-Not").append("\n");
        }
        System.out.println(sb);
    }
}
