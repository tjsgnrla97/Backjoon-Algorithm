package step14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_5086 {
	// 1. 배수와 약수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		int first = 0;
		int second = 0;
		while(true) {
			stk = new StringTokenizer(in.readLine());
			first = Integer.parseInt(stk.nextToken());
			second = Integer.parseInt(stk.nextToken());
			if(first==0 && second==0) break;
			if(second % first==0) sb.append("factor\n");
			else if(first % second==0) sb.append("multiple\n");
			else sb.append("neither\n");
		}
		sb.setLength(sb.length()-1);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
