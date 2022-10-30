package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2293 {
    //동전 1
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N,K;
    static int[] coin;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        input();
        solve();
        System.out.println(dp[K]);
    }
    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        K = Integer.parseInt(stk.nextToken());
        coin = new int[N+1];
        dp = new int[K+1];
        dp[0] = 1;
    }
    private static void solve() throws IOException {
        for(int i=1; i<=N; i++){
            coin[i] = Integer.parseInt(in.readLine());
            for (int j=coin[i]; j<=K; j++){
                dp[j] += dp[j-coin[i]];
            }
        }
    }


}
