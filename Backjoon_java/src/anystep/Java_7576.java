package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_7576 {
	//토마토
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static class Node{
		int y,x;

		public Node(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
	static int[][] box;
	static int M, N, ans;
	static Queue<Node> queue = new LinkedList<>();
	//상우하좌
	static int dy[] = {1,0,-1,0};
	static int dx[] = {0,1,0,-1};
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		
		M=Integer.parseInt(stk.nextToken());
		N=Integer.parseInt(stk.nextToken());
		box = new int[N+1][M+1];
		
		for(int y=1; y<=N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=1; x<=M; x++) {
				box[y][x] = Integer.parseInt(stk.nextToken());
				if(box[y][x]==1) queue.offer(new Node(y, x));
			}
		}
//		for(int[]b : box) System.out.println(Arrays.toString(b)); System.out.println();
		ans = bfs();
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static int bfs() {
		while(!queue.isEmpty()) {
			Node tomato = queue.poll();
			int y = tomato.y;
			int x = tomato.x;
			for(int d=0; d<4; d++) {
				int ny = y+dy[d];
				int nx = x+dx[d];
				if(isPosible(ny,nx)) {
					queue.offer(new Node(ny, nx));
					box[ny][nx] = box[y][x]+1;
				}
			}
		}
//		for(int[]b : box) System.out.println(Arrays.toString(b)); System.out.println();
		int result = Integer.MIN_VALUE;
		for(int y=1; y<=N; y++) {
			for(int x=1; x<=M; x++) {
				if(box[y][x]==0) return -1;
				result = Math.max(result, box[y][x]);
				System.out.println(result+" "+box[y][x]);
			}
		}
		if(result==1) return 0;
		return (result-1);
	}
	private static boolean isPosible(int ny, int nx) {
		if(ny<1 || ny>=N+1 || nx<1 || nx>=M+1) return false;
		if(box[ny][nx]==0) return true;
		return false;
	}

}
