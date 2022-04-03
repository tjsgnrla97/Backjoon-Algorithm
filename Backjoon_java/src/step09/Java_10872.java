package step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10872 {
	// 1. 팩토리얼
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		ans = factorial(N);
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static int factorial(int n) {
		if(n<=1) return 1;
		else return n*factorial(n-1);
	}

}
