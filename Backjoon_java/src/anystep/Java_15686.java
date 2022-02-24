package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_15686 {
	// 치킨 배달
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int N,M,ans;
	static int[][] map;
	static class Position{
		int y,x;
		public Position(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
	static ArrayList<Position> chicken, house;
	static Stack<Position> select;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N=Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		chicken = new ArrayList<>();
		house = new ArrayList<>();
		map = new int[N][N];
		ans = Integer.MAX_VALUE;
		select = new Stack<>();
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<N; x++) {
				map[y][x]=Integer.parseInt(stk.nextToken());
				if(map[y][x]==1) house.add(new Position(y, x));
				else if(map[y][x]==2) chicken.add(new Position(y, x));
			}
		}
		selcetChicken(0,0);
		System.out.println(ans);
	}
	private static void selcetChicken(int cnt, int start) {
		if(cnt==M) {
			int sum=0;
			for(int i=0; i<house.size(); i++) {
				int house_y = house.get(i).y;
				int house_x = house.get(i).x;
				int min = Integer.MAX_VALUE;
				for(Position p : select) {
					int chicken_y = p.y;
					int chicken_x = p.x;
					min = Math.min(min, calcDistance(house_y,house_x,chicken_y,chicken_x));
				}
//				System.out.println("현재 house idx : "+i+" 현재 min : "+min);
				sum+=min;
			}
			ans = Math.min(ans, sum);
			return;
		}
		for(int i=start; i<chicken.size(); i++) {
			select.push(new Position(chicken.get(i).y, chicken.get(i).x));
			selcetChicken(cnt+1, i+1);
			select.pop();
		}
	}
	private static int calcDistance(int house_y, int house_x, int chicken_y, int chicken_x) {
		return Math.abs(house_y-chicken_y)+Math.abs(house_x-chicken_x);
	}
}
