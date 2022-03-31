package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1149 {
	// RGB거리
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = Integer.parseInt(in.readLine());
		int[][] dp = new int[num+1][3];
		int[][] house = new int[num+1][3];
		for(int i=1; i<=num; i++) {
			stk = new StringTokenizer(in.readLine());
			for(int j=0; j<3; j++) {
				house[i][j]=Integer.parseInt(stk.nextToken());
			}
		}
		//dp[i] = dp[i-1]+min house[i]
		//dp[i][0] = Min(dp[i-1][1], dp[i-1][2])+house[i][0]
		//dp[i][1] = Min(dp[i-1][0], dp[i-1][2])+house[i][1]
		//dp[i][2] = Min(dp[i-1][0], dp[i-1][1])+house[i][2]
		for(int i=1; i<=num; i++) {
			dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2])+house[i][0];
			dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2])+house[i][1];
			dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1])+house[i][2];
		}
		int ans = Math.min(Math.min(dp[num][0], dp[num][1]), dp[num][2]);
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

}
