package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15988 {
    //1,2,3 더하기 3
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc=1; tc<=T; tc++) {
            int N = Integer.parseInt(in.readLine());
            long[] dp = new long[1000001];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            if(N>=4){
                for(int i=4; i<=N; i++) {
                    dp[i] = (dp[i-1]+dp[i-2]+dp[i-3]) % 1000000009;
                }
            }
            System.out.println(dp[N]);
        }
    }
}
