package step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1934 {
	// 4.최소공배수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int T;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(in.readLine());
		for(int tc=0; tc<T; tc++) {
			stk = new StringTokenizer(in.readLine());
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			out.write(lcm(A,B)+"\n");
		}
		out.flush();
		out.close();
		in.close();
	}
	private static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
	private static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}

}
