package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1699 {
    //제곱수의 합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] dp = new int[N+1];

        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            int min = 100001;

            for (int j = 1; j <= (int)i/2; j++) {
                if (j * j == i) {
                    min = 1;
                    break;
                }
                else {
                    min = Math.min(min, dp[j] + dp[i - j]);
                }
            }
            dp[i] = min;
        }
        System.out.println(dp[N]);
    }
}
