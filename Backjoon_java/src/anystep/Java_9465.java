package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9465 {
    //스티커
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int T, N;
    static int[][] stickers, dp;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());
        for (int tc=1; tc<=T; tc++){
            input();
            solutionDP();
            System.out.println(Math.max(dp[0][N],dp[1][N]));
        }
    }

    private static void solutionDP() {
        for (int x=2; x<=N; x++){
            dp[0][x] = Math.max(dp[1][x-1], dp[1][x-2])+stickers[0][x];
            dp[1][x] = Math.max(dp[0][x-1],dp[0][x-2])+stickers[1][x];
        }
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        stickers = new int[2][N+1];
        dp = new int[2][N+1];
        for (int y=0; y<2; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=1; x<=N; x++){
                stickers[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
        dp[0][1] = stickers[0][1];
        dp[1][1] = stickers[1][1];
    }
}
