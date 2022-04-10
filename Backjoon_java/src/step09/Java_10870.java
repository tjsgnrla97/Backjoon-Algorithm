package step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10870 {
	// 2.피보나치 수 5
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int ans = fibo(Integer.parseInt(in.readLine()));
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static int fibo(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}

}
