package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_10757 {
	//8. 큰 수 A+B
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static BigInteger A;
	static BigInteger B;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		A = new BigInteger(stk.nextToken());
		B = new BigInteger(stk.nextToken());
		out.write(String.valueOf(A.add(B)));
		out.flush();
		out.close();
		in.close();
	}

}
