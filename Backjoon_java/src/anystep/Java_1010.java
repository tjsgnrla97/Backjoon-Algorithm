package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_1010 {
	//다리 놓기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			stk = new StringTokenizer(in.readLine());
			BigInteger N = new BigInteger(stk.nextToken());
			BigInteger M = new BigInteger(stk.nextToken());
			BigInteger res = new BigInteger("1");
			for(int i=0; i<N.intValue(); i++) {
				res = res.multiply(M.subtract(BigInteger.valueOf(i)));
			}
			for(int j=1; j<=N.intValue(); j++) {
				res = res.divide(BigInteger.valueOf(j));
			}
			sb.append(res).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
