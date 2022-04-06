package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2239 {
	// 스도쿠
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N,ans,lastRank;
	static int[][] map;
	static boolean[][] rows, cols, squares;
	public static void main(String[] args) throws IOException {
		map = new int[10][10];
		rows = new boolean[10][10];
		cols = new boolean[10][10];
		squares = new boolean[10][10];
		for(int y=1; y<=9; y++) {
			char[] line = in.readLine().toCharArray();
			for(int x=1; x<=9; x++) {
				int num = line[x-1]-'0';
//				System.out.println(num);
				map[y][x]=num;
				if(num!=0) {
					rows[y][num]=true;
					cols[x][num]=true;
					squares[selectSquare(y,x)][num]=true;
				}
			}
		}
		solveSdoku(1,1);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static boolean solveSdoku(int y, int x) {
		if(y==10) {
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) sb.append(map[i][j]);
				if(i<=8) sb.append("\n");
			}
			return true;
		}
		int ny=y;
		int nx=x+1;
		if(nx==10) {
			ny=y+1;
			nx=1;
		}
		if(map[y][x]!=0) return solveSdoku(ny,nx);
		else {
			for(int j=1; j<=9; j++) {
				int currentSquare = selectSquare(y, x);
				if(rows[y][j] || cols[x][j] || squares[currentSquare][j]) continue;
				rows[y][j]=true;
				cols[x][j]=true;
				squares[currentSquare][j]=true;
				map[y][x]=j;
				boolean stop = solveSdoku(ny, nx);
				if(stop) return true;
				rows[y][j]=false;
				cols[x][j]=false;
				squares[currentSquare][j]=false;
				map[y][x]=0;
			}
		}
		return false;
	}
	private static int selectSquare(int y, int x) {
		if(y<=3) {
			if(x<=3) return 1;
			else if(x<=6) return 2;
			else return 3;
		}
		else if(y<=6) {
			if(x<=3) return 4;
			else if(x<=6) return 5;
			else return 6;
		}
		else {
			if(x<=3) return 7;
			else if(x<=6) return 8;
			else return 9;
		}
	}
}
