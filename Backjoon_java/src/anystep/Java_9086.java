package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9086 {
    //문자열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for(int tc=1; tc<=T; tc++) {
            String str = in.readLine();
            sb.append(str.charAt(0))
                    .append(str.charAt(str.length()-1))
                    .append("\n");
        }
        System.out.print(sb);
    }
}
