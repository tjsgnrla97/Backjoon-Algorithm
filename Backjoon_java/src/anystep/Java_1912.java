package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1912 {
    //연속합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] number = new int[N+1];
        int[] dp = new int[N+1];
        stk = new StringTokenizer(in.readLine());
        for(int i = 1; i<=N; i++) {
            number[i] = Integer.parseInt(stk.nextToken());
        }
        dp[1] = number[1];
        for(int i = 2; i<=N; i++) {
            dp[i] = Math.max(dp[i-1]+number[i],number[i]);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i<=N; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);

    }
}
