package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java_4485 {
	// 녹색 옷 입은 애가 젤다지?
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int N, tc;
	static int[][] map, dist;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	static class Node implements Comparable<Node>{
		int y, x, weight;
		
		
		public Node(int y, int x, int weight) {
			super();
			this.y = y;
			this.x = x;
			this.weight = weight;
		}


		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.weight-o.weight;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		tc=1;
		while(true) {
			N= Integer.parseInt(in.readLine());
			if(N==0) break;
			map = new int[N][N];
			dist = new int[N][N];
			for(int y=0; y<N; y++) {
				stk = new StringTokenizer(in.readLine());
				for(int x=0; x<N; x++) {
					map[y][x] = Integer.parseInt(stk.nextToken());
					dist[y][x] = Integer.MAX_VALUE;
				}
			}
			solve();
			sb.append("Problem ").append(tc).append(": ").append(dist[N-1][N-1]).append("\n");
			tc++;
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void solve() {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(0,0,map[0][0]));
		dist[0][0]=map[0][0];
		while(!pq.isEmpty()) {
			Node current = pq.poll();
			int y = current.y;
			int x = current.x;
			if(y==N-1 && x==N-1) break;
			for(int d=0; d<4; d++) {
				int ny = y+dy[d];
				int nx = x+dx[d];
				if(isBoundary(ny,nx)) continue;
				if(dist[y][x]+map[ny][nx]<dist[ny][nx]) {
					dist[ny][nx] = dist[y][x]+map[ny][nx];
					pq.add(new Node(ny,nx,dist[ny][nx]));
				}
			}
		}
	}
	private static boolean isBoundary(int ny, int nx) {
		if(ny<0 || nx<0 || ny>=N || nx>=N) return true;
		return false;
	}

}
