package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2475 {
	// 검증수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int[] arr = new int[5];
		int ans = 0;
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
			ans += Math.pow(arr[i], 2);
		}
		ans %= 10;
		System.out.println(ans);
	}

}
