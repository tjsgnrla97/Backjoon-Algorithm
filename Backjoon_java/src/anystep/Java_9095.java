package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9095 {
    //1,2,3 더하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());

        int[] dp = new int[11];

        dp[0] = 0;//1,2,3으로 0 생성 불가
        dp[1] = 1;//1,2,3 (1) 1가지
        dp[2] = 2;//1,2,3 (1+1),(2) 2가지
        dp[3] = 4;//1,2,3 (1+1+1),(1+2),(2+1),(3) 4가지
        //dp[4] case1 1+3 dp[3]=4 case2 2+2 dp[2]=2 case3 3+1 dp[1]=1 dp[4]=4+2+1=7

        int ans = 0;
        for(int tc = 0; tc < T; tc++) {
            ans = Integer.parseInt(in.readLine());
            for(int i = 4; i <= ans; i++) {
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
            System.out.println(dp[ans]);
        }
    }
}
