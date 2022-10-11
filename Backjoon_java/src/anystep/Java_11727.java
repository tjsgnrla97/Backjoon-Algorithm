package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11727 {
    //2xn 타일링 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] dp = new int[N+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]*2) % 10007;
        }
        System.out.println(dp[N]);
    }
}
