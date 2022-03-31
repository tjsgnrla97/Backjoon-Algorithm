package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1463 {
	// 1로 만들기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int num;
	static int[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		num = Integer.parseInt(in.readLine());
		dp = new int[num+1];
		dp[0]=0;
		dp[1]=0;
		for(int i=2; i<=num; i++) {
			dp[i]=dp[i-1]+1;
			if(i%2==0) dp[i]=Math.min(dp[i], dp[i/2]+1);
			if(i%3==0) dp[i]=Math.min(dp[i], dp[i/3]+1);
		}
		out.write(dp[num]+"");
		out.flush();
		out.close();
		in.close();
	}

}
