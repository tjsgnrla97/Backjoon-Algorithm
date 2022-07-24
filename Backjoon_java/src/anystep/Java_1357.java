package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1357 {
	// 뒤집힌 덧셈
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int A = Integer.parseInt(stk.nextToken());
		int B = Integer.parseInt(stk.nextToken());
		
		int ans = rev(rev(A)+rev(B));
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static int rev(int x) {
		int ans=0;
		while(x>0) {
			ans = ans*10+x%10;
			x/=10;
		}
		return ans;
	}
	

}
