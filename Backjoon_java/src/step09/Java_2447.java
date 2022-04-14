package step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2447 {
	// 별 찍기 - 10
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static char[][] stars;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		stars = new char[N][N];
		
		star(0, 0, N,false);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {				
				sb.append(stars[i][j]);
			}
			sb.append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void star(int y, int x,int n, boolean blank) {
		if(blank) {
			for(int i=y; i<y+n; i++) {
				for(int j=x; j<x+n; j++) {
					stars[i][j]=' ';
				}
			}
			return;
		}
		if(n==1) {
			stars[y][x]='*';
			return;
		}
		
		int size = n/3;
		int cnt = 0;
		for(int i=y; i<y+n; i+=size) {
			for(int j=x; j<x+n; j+=size) {
				cnt++;
				if(cnt==5) {
					star(i,j,size,true);
				}
				else star(i,j,size,false);
			}
		}
	}

}
