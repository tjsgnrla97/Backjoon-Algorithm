package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Java_1600 {
	// 말이 되고픈 원숭이
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int K, W, H, ans;
	static int[][] map;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static int[] ky = {2,1,-1,-2,2,1,-1,-2};
	static int[] kx = {-1,-2,-2,-1,1,2,2,1};
	static class Monkey{
		int y, x, moveCnt, k;

		public Monkey(int y, int x, int moveCnt, int k) {
			super();
			this.y = y;
			this.x = x;
			this.moveCnt = moveCnt;
			this.k = k;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		K = Integer.parseInt(in.readLine());
		stk = new StringTokenizer(in.readLine());
		W = Integer.parseInt(stk.nextToken());
		H = Integer.parseInt(stk.nextToken());
		map = new int[H][W];
		for(int y=0; y<H; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<W; x++) {
				map[y][x]=Integer.parseInt(stk.nextToken());
			}
		}
		ans = Integer.MAX_VALUE;
		bfs(new Monkey(0,0,0,0), new boolean[H][W][K+1]);
		if(ans==Integer.MAX_VALUE) out.write(-1+"");
		else out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void bfs(Monkey start, boolean[][][] isVisited) {
		Deque<Monkey> dq = new ArrayDeque<>();
		dq.offer(start);
		isVisited[start.y][start.x][0]=true;
		while(!dq.isEmpty()) {
			Monkey monkey = dq.poll();
			int startY = monkey.y;
			int startX = monkey.x;
			int startCnt = monkey.moveCnt;
			int startK = monkey.k;
			if(startY == H-1 && startX == W-1) ans=Math.min(ans, startCnt);
			for(int d=0; d<4; d++) {
				int ny= startY + dy[d];
				int nx= startX + dx[d];
				if(isBoudary(ny,nx)) continue;
				if(startK> K || isVisited[ny][nx][startK] || map[ny][nx]==1) continue;
				dq.offer(new Monkey(ny,nx,startCnt+1,startK));
				isVisited[ny][nx][startK]=true;
				
			}
			if(startK<=K-1) {
				for(int d=0; d<8; d++) {
					int ny = startY + ky[d];
					int nx = startX + kx[d];
					if(isBoudary(ny,nx)) continue;
					if(isVisited[ny][nx][startK+1] || map[ny][nx]==1) continue;
					dq.offer(new Monkey(ny, nx, startCnt+1, startK+1));
					isVisited[ny][nx][startK+1]=true;
					
				}
			}
		}
	}
	private static boolean isBoudary(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=H || nx>=W) return true;
		return false;
	}

}

