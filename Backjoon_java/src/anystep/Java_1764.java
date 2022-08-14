package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Java_1764 {
	// 듣보잡
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		HashSet<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(in.readLine());
		}
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0; i<M; i++) {
			String temp = in.readLine();
			if(set.contains(temp)) {
				ans.add(temp);
			}
		}
		Collections.sort(ans);
		sb.append(ans.size()).append("\n");
		for(String str : ans) sb.append(str).append("\n");
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
