package fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_12904_fail {
	// A와B
	//solution 1. dfs를 사용하여 S가 T의 길이를 만족할때까지의 모든 조합의 경우를 구한다.
	//실패 : TLE(시간초과)
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static String S, res;
	public static void main(String[] args) throws IOException {
		S = in.readLine();
		res = in.readLine();
		dfs(S);
		System.out.println(0);
	}
	private static void dfs(String ans) {
		if(ans.length()==res.length()) {
			if(ans.equals(res)) {
				System.out.println(1);
				System.exit(0);;
			}
			return;
		}
		dfs(ans+"A");
		dfs(reverse(ans)+"B");
	}
	private static String reverse(String ans) {
		return (new StringBuilder(ans).reverse().toString());
	}
}
