package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_1194 {
	//달이 차오른다, 가자
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int H,W,ans=Integer.MAX_VALUE;
	static int[] dy= {-1,1,0,0};
	static int[] dx= {0,0,-1,1};
	static char[][] map;
	static boolean[][][] isVisited;
	static class Node{
		int y,x,key,cnt;

		public Node(int y, int x, int key, int cnt) {
			super();
			this.y = y;
			this.x = x;
			this.key = key;
			this.cnt = cnt;
		}
		
	}
	static Queue<Node> q = new LinkedList<>();
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		H = Integer.parseInt(stk.nextToken());
		W = Integer.parseInt(stk.nextToken());
		map= new char[H][W];
		isVisited = new boolean[H][W][64];
		for(int y=0; y<H; y++) {
			map[y] = in.readLine().toCharArray();
			for(int x=0; x<W; x++) {
				if(map[y][x]=='0') {
					q.add(new Node(y,x,0,0));
					map[y][x]='.';
				}
			}
		}
		bfs();
		if(ans==Integer.MAX_VALUE) out.write(-1+"");
		else out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void bfs() {
		while(!q.isEmpty()) {
			Node current = q.poll();
			int y = current.y;
			int x = current.x;
			int key = current.key;
			int cnt = current.cnt;
			if(isVisited[y][x][key]) continue;
			isVisited[y][x][key]=true;
			for(int d=0; d<4; d++) {
				int ny = y+dy[d];
				int nx = x+dx[d];
				if(isBoundary(ny,nx)) continue;
				if(map[ny][nx]=='1') ans = Math.min(ans, cnt+1);
				if(map[ny][nx]=='.') {
					q.add(new Node(ny,nx,key,cnt+1));
				}else if('a'<=map[ny][nx] && map[ny][nx]<='f') {
					q.add(new Node(ny, nx, key | (1<<((int)map[ny][nx]-'a')), cnt+1));
				}else if('A'<=map[ny][nx]&&map[ny][nx]<='F') {
					int matchingKey = key & (1<<((int)map[ny][nx]-'A'));
					if(matchingKey>0) q.add(new Node(ny,nx,key,cnt+1));
				}
			}
			
		}
	}
	private static boolean isBoundary(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=H || nx>=W) return true;
		return false;
	}

}
