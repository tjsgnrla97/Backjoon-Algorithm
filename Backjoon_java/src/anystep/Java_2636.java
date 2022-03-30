package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2636 {
	// 치즈
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N,M,time,ans;
	static int[][] board;
	static boolean[][] isVisited;
	static int[] dy= {-1,1,0,0};
	static int[] dx= {0,0,-1,1};

	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		board = new int[N][M];
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<M; x++) {
				board[y][x] = Integer.parseInt(stk.nextToken());
				if(board[y][x]==1) ans++;
			}
		}
		while(true) {
			isVisited = new boolean[N][M];
			outLayer(0,0);
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(board[y][x]==1 && isLayerCheese(y,x)) dfs(y,x);
				}
			}
			meltCheese();
			checkHole();
			time++;
			int checkEndCheese=cheese();
			if(checkEndCheese!=0) ans=cheese();
			else break;
		}
		sb.append(time).append("\n").append(ans);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

	private static int cheese() {
		int cnt=0;
		for(int y=0; y<N; y++) {
			for(int x=0; x<M; x++) {
				if(board[y][x]==1) cnt++;
			}
		}
		return cnt;
	}

	private static void checkHole() {
		for(int y=0; y<N; y++) {
			for(int x=0; x<M; x++) {
				if(board[y][x]==2) board[y][x]=0;
			}
		}
	}

	private static void meltCheese() {
		for(int y=0; y<N; y++) {
			for(int x=0; x<M; x++) {
				if(board[y][x]==-2) board[y][x]=2;
			}
		}
	}

	private static void dfs(int y, int x) {
		isVisited[y][x]=true;
		board[y][x]=-2;
		for(int d=0; d<4; d++) {
			int ny=y+dy[d];
			int nx=x+dx[d];
			if(isBoundary(ny, nx)) {
				if(board[ny][nx]==1 && !isVisited[ny][nx] && isLayerCheese(ny, nx)) {
					dfs(ny,nx);
				}
			}
		}
	}

	private static boolean isLayerCheese(int y, int x) {
		for(int d=0; d<4; d++) {
			int ny=y+dy[d];
			int nx=x+dx[d];
			if(board[ny][nx]==2) return true;
		}
		return false;
	}

	private static void outLayer(int y, int x) {
		isVisited[y][x]=true;
		board[y][x]=2;
		for(int d=0; d<4; d++) {
			int ny=y+dy[d];
			int nx=x+dx[d];
			if(isBoundary(ny,nx)) {
				if(board[ny][nx]==0 && !isVisited[ny][nx]) {
					outLayer(ny,nx);
				}
			}
		}
	}

	private static boolean isBoundary(int ny, int nx) {
		if(ny>=0 && nx>=0 && ny<N && nx<M) return true;
		return false;
	}

}
