package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_2407 {
	// 조합
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		
		for(int i=0; i<M; i++) {
			n1 = n1.multiply(new BigInteger(String.valueOf(N-i)));
			n2 = n2.multiply(new BigInteger(String.valueOf(i+1)));
		}
		BigInteger ans = n1.divide(n2);
		System.out.println(ans);
	}

}
