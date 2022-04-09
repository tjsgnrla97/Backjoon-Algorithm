package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_17135 {
	// 캐슬 디펜스
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M,D,ans;
	static int[][] map;
	static class Pos{
		int y,x;

		public Pos(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
		
	}
	static ArrayList<Pos> enemy = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		input();
		selectArcherPos(0,0,new int[3]);
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void selectArcherPos(int start, int depth, int[] archer) {
		if(depth==3) {
			int score=defense(archer);
			ans=Math.max(ans, score);
			return;
		}
		for(int i=start; i<M; i++) {
			archer[depth]=i;
			selectArcherPos(i+1, depth+1, archer);
		}
	}
	private static int defense(int[] archer) {
		int row=N;
		int cnt=0;
		boolean[] enemyLife = new boolean[enemy.size()];
		Arrays.fill(enemyLife, true);
		while(row>0) {
			Pos[] killPoint = new Pos[3];
			for(int i=0; i<archer.length; i++) {
				int minDist=D;
				Pos archerCurrentPos = new Pos(row,archer[i]);
				killPoint[i]=new Pos(-1,M);
				for(int j=0; j<enemyLife.length; j++) {
					if(!enemyLife[j]) continue;
					Pos target = enemy.get(j);
					int AEDist = distance(archerCurrentPos,target);
					if((AEDist==minDist && target.x<killPoint[i].x)|| (AEDist<minDist)) {
						minDist = distance(archerCurrentPos,target);
						killPoint[i]=target;
					}
				}
			}
			row--;
			
			for(int i=0; i<enemyLife.length; i++) {
				for(int j=0; j<killPoint.length; j++) {
					if((killPoint[j].x==enemy.get(i).x)&&(killPoint[j].y==enemy.get(i).y)&&enemyLife[i]) {
						cnt++;
						enemyLife[i]=false;
					}
				}
				if(enemy.get(i).y==row) enemyLife[i]=false;
			}
		}
		return cnt;
	}
	private static int distance(Pos archerCurrentPos, Pos target) {
		return Math.abs(archerCurrentPos.y-target.y)+Math.abs(archerCurrentPos.x-target.x);
	}
	private static void input() throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		D = Integer.parseInt(stk.nextToken());
		
		map = new int[N][M];
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<M; x++) {
				map[y][x]=Integer.parseInt(stk.nextToken());
				if(map[y][x]==1) enemy.add(new Pos(y, x));
			}
		}
	}

}
