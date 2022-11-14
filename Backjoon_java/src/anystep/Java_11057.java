package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11057 {
    //오르막 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int[][] dp;
    static int N,ans;
    public static void main(String[] args) throws IOException {
        input();
        solveDp();
        System.out.println(ans%10007);
    }

    private static void solveDp() {
        for (int i=2; i<=N; i++){
            for (int j=0; j<10; j++){
                for (int k=0; k<=j; k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        for (int i=0; i<10; i++) {
            ans += dp[N][i];
        }
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        dp = new int[N+1][10];
        for (int i=0; i<10; i++){
            dp[1][i] =1;
        }
    }
}
