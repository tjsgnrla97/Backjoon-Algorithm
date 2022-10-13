package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2193 {
    //이친수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        long[][] dp = new long[N+1][2];
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i = 2; i <= N; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }
        System.out.println(dp[N][1]+dp[N][0]);
    }
}
