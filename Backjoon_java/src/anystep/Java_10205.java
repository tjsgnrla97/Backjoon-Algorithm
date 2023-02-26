package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10205 {
    //헤라클레스와 히드라
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int C = Integer.parseInt(in.readLine());
            String str = in.readLine();
            int sz = str.length();
            for (int i = 0; i < sz; i++) C += str.charAt(i) == 'c' ? 1 : -1;
            if (tc != 1) sb.append("\n");
            sb.append("Data Set " + tc + ":\n" + C + "\n");
        }
        System.out.println(sb);
    }
}
