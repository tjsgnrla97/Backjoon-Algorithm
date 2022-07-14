package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_15784 {
	// 질투진서
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int ans=0;
		
		int[][] map = new int[N+1][N+1];
		
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<N; x++) {
				map[y+1][x+1] = Integer.parseInt(stk.nextToken());
				if(y+1==a && x+1==b) ans = map[y+1][x+1];
			}
		}
		sb.append("");
		a : for(int y=1; y<=N; y++) {
			for(int x=1; x<=N; x++) {
				if(x==b && ans<map[y][x]) {
					sb.append("ANGRY");
					break a;
				}
				if(y==a && ans<map[y][x]) {
					sb.append("ANGRY");
					break a;
				}
			}
		}
		if(sb.length()==0) sb.append("HAPPY");
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
