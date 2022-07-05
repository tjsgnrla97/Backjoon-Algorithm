package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_14659 {
	// 한조서열정리하고옴ㅋㅋ
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		int[] archer = new int[N];
		stk = new StringTokenizer(in.readLine());
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<N; i++) archer[i] = Integer.parseInt(stk.nextToken());
		
		for(int i=0; i<N; i++) {
			int cnt = 0;
			for(int j=i+1; j<N; j++) {
				if(archer[i]>archer[j]) cnt++;
				else break;
			}
			ans = Math.max(ans, cnt);
		}
		System.out.println(ans);
	}

}
