package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11055 {
    //가장 큰 증가 부분 수열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N;
    static int[] arr, dp;
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void solve() {
        for(int i=2; i<=N; i++){
            dp[i] = arr[i];
            for(int j=1; j<i; j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[j]+arr[i],dp[i]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=N; i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        arr = new int[N+1];
        dp = new int[N+1];
        stk = new StringTokenizer(in.readLine());
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        dp[1] = arr[1];
    }
}
