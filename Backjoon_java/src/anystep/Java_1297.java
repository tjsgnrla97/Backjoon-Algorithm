package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1297 {
	// TV 크기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int D = Integer.parseInt(stk.nextToken());
		int H = Integer.parseInt(stk.nextToken());
		int W = Integer.parseInt(stk.nextToken());
		
		double powX = Math.pow(D, 2)/(Math.pow(H, 2)+Math.pow(W, 2));
		out.write((int)Math.sqrt(powX*Math.pow(H, 2))+" "+(int)Math.sqrt(powX*Math.pow(W, 2)));
		out.flush();
		out.close();
		in.close();
	}

}
