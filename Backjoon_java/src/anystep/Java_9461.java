package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9461 {
    //파도반 수열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for(int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(in.readLine());
            long[] dp = new long[101];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            for(int i = 4; i <= N; i++) {
                dp[i] = dp[i-3] + dp[i-2];
            }
            sb.append(dp[N]).append("\n");
        }
        sb.setLength(sb.length()-1);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
