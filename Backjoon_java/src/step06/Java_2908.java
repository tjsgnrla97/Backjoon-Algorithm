package step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_2908 {

	public static void main(String[] args) throws IOException {
		// 7.상수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(in.readLine());
		StringBuilder a = new StringBuilder().append(stk.nextToken());
		StringBuilder b = new StringBuilder().append(stk.nextToken());
		int resA = Integer.parseInt(a.reverse().toString());
		int resB = Integer.parseInt(b.reverse().toString());
		int max=Integer.MIN_VALUE;
		max = Math.max(resA, resB);
		System.out.println(max);
		in.close();
	}

}
