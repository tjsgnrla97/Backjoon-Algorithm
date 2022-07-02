package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2455 {
	// 지능형 기차
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		int ans=0;
		int sum=0;
		for(int tc=1; tc<=4; tc++) {
			stk = new StringTokenizer(in.readLine());
			sum -= Integer.parseInt(stk.nextToken());
			sum += Integer.parseInt(stk.nextToken());
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);

	}

}
