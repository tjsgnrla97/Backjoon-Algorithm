package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_1992 {
	static int[][] movie;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(in.readLine());
		movie = new int[N][N];
		for(int y=0; y<N; y++) {
			String stk = in.readLine();
			for(int x=0; x<N; x++) {
				movie[y][x] = stk.charAt(x)-'0';
			}
		}
		Zip(0,0,N);
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}
	private static void Zip(int y, int x, int size) {
		if(isAllEquals(y,x,size)) {
			sb.append(movie[y][x]);
			return;
		}
		int nextSize = size / 2;
		
		sb.append('(');
		
		Zip(y,x,nextSize);
		Zip(y,x+nextSize,nextSize);
		Zip(y+nextSize,x,nextSize);
		Zip(y+nextSize,x+nextSize,nextSize);
		
		sb.append(')');
	}
	private static boolean isAllEquals(int y, int x, int size) {
		int img = movie[y][x];
		for(int i=y; i<y+size; i++) {
			for(int j=x; j<x+size; j++) {
				if(img != movie[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
