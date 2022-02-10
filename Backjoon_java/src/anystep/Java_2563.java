package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2563 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 색종이
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[][] black_paper = new boolean[101][101];
		int cnt=0; 
		for(int y=1; y<101; y++) {
			for(int x=1; x<101; x++) {
				black_paper[y][x] = false;
			}
		}
		int papers = Integer.parseInt(in.readLine());
		int[][] start_black = new int[101][101];
		for(int i=1; i<papers+1; i++) {
			StringTokenizer stk = new StringTokenizer(in.readLine());
			int x=Integer.parseInt(stk.nextToken());
			int y=Integer.parseInt(stk.nextToken());
			start_black[y][x]=1;
		}
		for(int y=1; y<101; y++) {
			for(int x=1; x<101; x++) {
				int x_del=0; int y_del=0;
				if(start_black[y][x] !=0 ) {
					if(x+10>=101) {
						x_del += (x+10)-101;
					}
					if(x+10>=101) {
						y_del += (y+10)-101;
					}
					for(int sy=y; sy<y+10-y_del; sy++) {
						for(int sx=x; sx<x+10-x_del; sx++) {
							black_paper[sy][sx]=true;
						}
					}
				}
			}
		}
		for(int y=0; y<101; y++) {
			for(int x=0; x<101; x++) {
				if(black_paper[y][x]) cnt++;
			}
		}
		sb.append(cnt);
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}
}
