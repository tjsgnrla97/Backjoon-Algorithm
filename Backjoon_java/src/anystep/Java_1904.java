package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1904 {
    //01타일
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
//    [1], [11,00], [100,111,001], [1(100),1(111),1(001),00(11),00(00)]
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] dp = new int[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= N; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%15746;
        }
        System.out.println(dp[N]);
    }
}
