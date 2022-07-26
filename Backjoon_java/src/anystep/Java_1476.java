package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1476 {
	// 날짜 계산
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int e = Integer.parseInt(stk.nextToken());
		int s = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		int E=0,S=0,M=0,ans = 0;
		while(true) {
			ans++;
			E++;
			S++;
			M++;
			if(E==16) E=1;
			if(S==29) S=1;
			if(M==20) M=1;
			if(e==E && m==M && S==s) break;
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

}
