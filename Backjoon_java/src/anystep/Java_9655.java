package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9655 {
    //돌 게임
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for (int i = 4; i <= N; i++) {
            dp[i] = Math.min(dp[i-1],dp[i-3])+1;
        }
        if(dp[N] % 2 == 0) {
            System.out.println("CY");
        }else {
            System.out.println("SK");
        }
    }
}
