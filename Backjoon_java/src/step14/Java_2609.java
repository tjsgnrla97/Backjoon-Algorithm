package step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2609 {
	// 3. 최대공약수와 최소공배수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int a, b, ans1, ans2;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		a = Integer.parseInt(stk.nextToken());
		b = Integer.parseInt(stk.nextToken());
		ans1 = gcd(a,b);
		ans2 = lcm(a,b);
		out.write(ans1+"\n"+ans2);
		out.flush();
		out.close();
		in.close();
	}
	private static int lcm(int A, int B) {
		return A*B / gcd(A,B);
	}
	private static int gcd(int A, int B) {
		while(B!=0) {
			int res = A%B;
			A = B;
			B = res;
		}
		return A;
	}

}
