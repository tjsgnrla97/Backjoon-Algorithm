package step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11050 {
	// 7.이항 계수 1
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int ans;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(stk.nextToken());
		int k = Integer.parseInt(stk.nextToken());
		ans = factorial(n)/(factorial(k)*factorial(n-k));
		System.out.println(ans);
	}
	private static int factorial(int n) {
		int res=1;
		for(int i=1; i<=n; i++) {
			res *= i;
		}
		return res;
	}

}
