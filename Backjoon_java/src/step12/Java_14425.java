package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java_14425 {
	// 2. 문자열 집합
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M,ans;
	static HashMap<String, Integer> map;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		map = new HashMap();
		for(int i=0; i<N; i++) map.put(in.readLine(), 1);
		for(int i=0; i<M; i++) {
			String temp = in.readLine();
			if(map.get(temp) != null) ans++;
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

}
