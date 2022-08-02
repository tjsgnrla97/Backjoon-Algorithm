package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_1271 {
	// 엄청난 부자2
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		
		BigInteger A = new BigInteger(stk.nextToken());
		BigInteger B = new BigInteger(stk.nextToken());
		out.write(A.divide(B)+"\n"+A.remainder(B));
		out.flush();
		out.close();
		in.close();
	}

}
