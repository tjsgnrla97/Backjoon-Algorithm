package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10844 {
    //쉬운 계단 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());

        long[][] dp = new long[N + 1][10];

        dp[1][0] = 0;
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1];

            for (int j = 1; j <= 9; j++) {
                if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % 1000000000;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] % 1000000000 + dp[i - 1][j + 1] % 1000000000) % 1000000000;
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans = (ans + dp[N][i]) % 1000000000;
        }
        System.out.println(ans);
    }
}
