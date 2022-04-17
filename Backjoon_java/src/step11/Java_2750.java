package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2750 {
	// 수 정렬하기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N;
	static int[] ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		ans = new int[N];
		for(int i=0; i<N; i++) ans[i]=Integer.parseInt(in.readLine());
		Arrays.sort(ans);
		for(int b : ans) sb.append(b).append("\n");
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
