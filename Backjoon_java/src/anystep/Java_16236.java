package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_16236 {
	// 아기상어
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int N, time;
	static int[][] map;
	static Shark shark;
	static ArrayList<Fish> fishes;
	static int[] dy= {-1,1,0,0};
	static int[] dx= {0,0,-1,1};
	static class Index{
		int y;
		int x;
		int dis; //상어로부터의 거리
		public Index(int y, int x, int dis) {
			super();
			this.y = y;
			this.x = x;
			this.dis = dis;
		}
	}
	static class Fish extends Index implements Comparable<Fish>{
		int size;

		public Fish(int y, int x, int dis, int size) {
			super(y, x, dis);
			this.size = size;
		}

		@Override
		public int compareTo(Fish o) {
			return this.y==o.y?this.x-o.x:this.y-o.y;
		}
	}
	static class Shark{
		int y;
		int x;
		int size;
		int eat;
		public Shark(int y, int x, int size, int eat) {
			super();
			this.y = y;
			this.x = x;
			this.size = size;
			this.eat = eat;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		fishes = new ArrayList<>();
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<N; x++) {
				map[y][x] = Integer.parseInt(stk.nextToken());
				if(map[y][x]==9) {
					shark = new Shark(y, x, 2, 0);
				}
				else if(map[y][x]>=1&&map[y][x]<=6) fishes.add(new Fish(y, x, map[y][x], 0));
			}
		}
		hunt();
	}
	private static void hunt() {
		while(!fishes.isEmpty()) {
			if(!bfs(new boolean[N][N])) break;
		}
		System.out.println(time);
	}
	private static boolean bfs(boolean[][] visited) {
		Queue<Index> q = new LinkedList<>();
		q.add(new Index(shark.y,shark.x,0));
		visited[shark.y][shark.x]=true;
		ArrayList<Fish> eatableFishes = new ArrayList<>();
		while(!q.isEmpty()) {
			Index node = q.poll();
			int sy = node.y;
			int sx = node.x;
			int sDis = node.dis;
			for(int d=0; d<4; d++) {
				int ny = sy+dy[d];
				int nx = sx+dx[d];
				if(ny<0||nx<0||ny>=N||nx>=N) continue;
				if(visited[ny][nx]) continue;
				if(map[ny][nx]>0&&map[ny][nx]!=9) {
					if(shark.size>map[ny][nx]) {
						if(eatableFishes.size()==0) eatableFishes.add(new Fish(ny,nx,sDis+1,map[ny][nx]));
						else if(eatableFishes.get(eatableFishes.size()-1).dis==sDis+1) eatableFishes.add(new Fish(ny, nx, sDis+1, map[ny][nx]));
					}
					else if(shark.size<map[ny][nx]) continue;
				}
				visited[ny][nx]=true;
				q.add(new Index(ny, nx, sDis+1));
			}
		}
		Collections.sort(eatableFishes);
		if(eatableFishes.size()==0) return false;
		Fish eatFish = eatableFishes.get(0);
		int idx = 0;
		for(int i=0; i<fishes.size(); i++) {
			Fish fish = fishes.get(i);
			if(fish.y==eatFish.y&&fish.x==eatFish.x) {
				idx=i;
				shark.eat++;
				time+=eatFish.dis;
				shark.y=eatFish.y;
				shark.x=eatFish.x;
				map[eatFish.y][eatFish.x]=0;
				break;
			}
		}
		if(shark.eat==shark.size) {
			shark.size++;
			shark.eat=0;
		}
		fishes.remove(idx);
//		System.out.println(eatFish.y+" "+eatFish.x+" 먹음, time : "+time+" 상어 size : "+shark.size);
		return true;
	}
}
