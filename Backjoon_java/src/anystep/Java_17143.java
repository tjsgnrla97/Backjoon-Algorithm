package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_17143 {
	// 낚시왕
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int Y,X,M,ans;
	static class Shark{
		int spd, dir, size;
		
		
		public Shark() {
			super();
		}


		public Shark(int spd, int dir, int size) {
			super();
			this.spd = spd;
			this.dir = dir;
			this.size = size;
		}
		
	}
	static Shark[][] map;
	public static void main(String[] args) throws IOException {
		input();
		solve();
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void solve() {
		for(int x=0; x<X; x++) {
			fishingMan(x);
			moveSharks();
		}
	}
	private static void moveSharks() {
		Shark[][] updateMap = new Shark[Y][X];
		for(int y=0; y<Y; y++) {
			for(int x=0; x<X; x++) {
				moveShark(updateMap, y, x);
			}
		}
		for(int y=0; y<Y; y++) {
			map[y] = Arrays.copyOf(updateMap[y], X);
		}
	}
	private static void moveShark(Shark[][] updateMap, int y, int x) {
		Shark currentShark = map[y][x];
		if(currentShark==null) return;
		int D = currentShark.dir<3?Y:X;
		int minMoveDistance = currentShark.spd % ((D-1)*2);
		int ny = y;
		int nx = x;
		
		for(int move=0; move<minMoveDistance; move++) {
			if(currentShark.dir==1) {
				ny--;
				if(ny<0) {
					currentShark.dir=2;
					ny=1;
				}
			}
			else if(currentShark.dir==2) {
				ny++;
				if(ny>Y-1) {
					currentShark.dir=1;
					ny=Y-2;
				}
			}
			else if(currentShark.dir==3) {
				nx++;
				if(nx>X-1) {
					currentShark.dir=4;
					nx=X-2;
				}
			}
			else {
				nx--;
				if(nx<0) {
					currentShark.dir=3;
					nx=1;
				}
			}
		}
		if(updateMap[ny][nx] != null && updateMap[ny][nx].size>currentShark.size) return;
		
		updateMap[ny][nx] = currentShark;
	}
	private static void fishingMan(int x) {
		for(int y=0; y<Y; y++) {
			if(map[y][x] != null) {
				ans += map[y][x].size;
				map[y][x]=null;
				return;
			}
		}
	}
	private static void input() throws IOException {
		stk = new StringTokenizer(in.readLine());
		Y = Integer.parseInt(stk.nextToken());
		X = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		map = new Shark[Y][X];
		
		for(int i=0; i<M; i++) {
			stk = new StringTokenizer(in.readLine());
			
			Shark shark = new Shark();
			int y = Integer.parseInt(stk.nextToken());
			int x = Integer.parseInt(stk.nextToken());
			shark.spd = Integer.parseInt(stk.nextToken());
			shark.dir = Integer.parseInt(stk.nextToken());
			shark.size = Integer.parseInt(stk.nextToken());
			map[y-1][x-1]=shark;
		}
	}

}
