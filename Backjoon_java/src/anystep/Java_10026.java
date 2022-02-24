package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10026 {
	// 적록색약
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static char[][] paint, paint2;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int N, ansNomal, ansAbnomal;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		paint = new char[N][N];
		paint2 = new char[N][N];
		for(int y=0; y<N; y++) {
			String s = in.readLine();
			for(int x=0; x<N; x++) {
				paint[y][x]=s.charAt(x);
				if(s.charAt(x)=='G') paint2[y][x]='R';
				else paint2[y][x] = s.charAt(x);
			}
		}
//		for(char[] b : paint) System.out.println(Arrays.toString(b));
//		System.out.println();
//		for(char[] b : paint2) System.out.println(Arrays.toString(b));
		ansNomal=0;
		ansAbnomal=0;
		for(int y=0; y<N; y++) {
			for(int x=0; x<N; x++) {
				if(paint[y][x]!='X') {
					dfs(y,x,paint[y][x]);
					ansNomal++;
				}
				if(paint2[y][x]!='X') {
					dfs2(y,x,paint2[y][x]);
					ansAbnomal++;
				}
			}
		}
//		ansAbnomal=N*N-ansAbnomal-1;
//		System.out.println(ansNomal+" "+ansAbnomal);
		out.append(ansNomal+" "+ansAbnomal);
		in.close();
		out.flush();
		out.close();
	}
	static void dfs2(int y, int x, char color2) {
		paint2[y][x]='X';
		for(int d=0; d<4; d++) {
			int ny = y+dy[d];
			int nx = x+dx[d];
			if(ny<0||nx<0||ny>=N||nx>=N) continue;
			if(paint2[ny][nx]=='X') continue;
			if(color2 != paint2[ny][nx]) continue;
			dfs2(ny, nx, paint2[ny][nx]);
		}
	}
	static void dfs(int y, int x, char color) {
		paint[y][x]='X';
		for(int d=0; d<4; d++) {
			int ny = y+dy[d];
			int nx = x+dx[d];
			if(ny<0||nx<0||ny>=N||nx>=N) continue;
			if(paint[ny][nx]=='X') continue;
			if(color != paint[ny][nx]) continue;
			dfs(ny, nx, paint[ny][nx]);
		}
	}
}
