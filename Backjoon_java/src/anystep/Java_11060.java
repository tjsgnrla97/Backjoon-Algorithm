package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11060 {
    //점프 점프
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N;
    static int[] miro;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        input();
        dp();
        printAns();
    }
    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        miro = new int[N+1];
        stk = new StringTokenizer(in.readLine());
        for(int i=1; i<=N; i++) miro[i] = Integer.parseInt(stk.nextToken());
        in.close();
        dp = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        //if (miro[1] != 0)
        dp[1] = 0;
    }
    private static void dp() {
        for (int i = 1; i <= N; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                int jump = miro[i];
                for (int j = 1; j <= jump; j++) {
                    if(i + j > N) continue;
                    dp[i+j] = Math.min(dp[i]+1, dp[i+j]);
                }
            }
        }
    }
    private static void printAns() {
        System.out.println(dp[N]==Integer.MAX_VALUE?-1:dp[N]);
    }
}
