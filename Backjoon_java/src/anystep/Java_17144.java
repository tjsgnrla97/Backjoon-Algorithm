package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_17144 {
	// 미세먼지
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int R,C,T;
	static int[][] map;
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,1,-1};
	static int ans;
	static AirCleaner[] cleaners = new AirCleaner[2];
	static class AirCleaner{
		int y,x;

		public AirCleaner(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		R = Integer.parseInt(stk.nextToken());
		C = Integer.parseInt(stk.nextToken());
		T = Integer.parseInt(stk.nextToken());
		map = new int[R][C];
		int cleanerIdx=0;
		for(int y=0; y<R; y++) {
			stk=new StringTokenizer(in.readLine());
			for(int x=0; x<C; x++) {
				map[y][x]=Integer.parseInt(stk.nextToken());
				if(map[y][x]==-1) {
					cleaners[cleanerIdx++] = new AirCleaner(y, x);
				}
			}
		}
		for(int i=0; i<T; i++) {
			spreadOn(new int[R][C]);
			cleanerOn(new int[R][C]);
		}
		for(int y=0; y<R; y++) {
			for(int x=0; x<C; x++) {
				if(map[y][x]<=0) continue;
				ans+=map[y][x];
			}
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

	private static void cleanerOn(int[][] copyMap) {
		for(int cleanerIdx=0; cleanerIdx<2; cleanerIdx++) {
			AirCleaner current = cleaners[cleanerIdx];
			int ny = current.y;
			int nx = current.x+1;
			while(nx<C-1) {
				copyMap[ny][nx+1]=map[ny][nx];
				nx++;
			}
			if(cleanerIdx==0) {
				while(ny>0) {
					copyMap[ny-1][nx] = map[ny][nx];
					ny--;
				}
			}else {
				while(ny<R-1) {
					copyMap[ny+1][nx]=map[ny][nx];
					ny++;
				}
			}
			while(nx>0) {
				copyMap[ny][nx-1]=map[ny][nx];
				nx--;
			}
			if(cleanerIdx==0) {
				while(ny<current.y-1) {
					copyMap[ny+1][nx]=map[ny][nx];
					ny++;
				}
			}else {
				while(ny>current.y+1) {
					copyMap[ny-1][nx]=map[ny][nx];
					ny--;
				}
			}
		}
		cleanerUpdate(copyMap);
	}

	private static void cleanerUpdate(int[][] copyMap) {
		for(int y=0; y<R; y++) {
			for(int x=0; x<C; x++) {
				if(y==0 || y==R-1 || x==0 || x==C-1 || y==cleaners[0].y || y==cleaners[1].y) {
					map[y][x]=copyMap[y][x];
				}
			}
		}
		map[cleaners[0].y][cleaners[1].x]=-1;
		map[cleaners[1].y][cleaners[1].x]=-1;
	}

	private static void spreadOn(int[][] copyMap) {
		for(int y=0; y<R; y++) {
			for(int x=0; x<C; x++) {
				copyMap[y][x] += map[y][x];
				if(map[y][x]<5) continue;
				int spreadWeight = map[y][x] / 5;
				for(int d=0; d<4; d++) {
					int ny = y+dy[d];
					int nx = x+dx[d];
					if(ny>=0 && nx>=0 && ny<R && nx<C && map[ny][nx]!=-1) {
						copyMap[y][x] -= spreadWeight;
						copyMap[ny][nx] += spreadWeight;
					}
				}
			}
		}
		mapUpdate(copyMap);
	}

	private static void mapUpdate(int[][] copyMap) {
		for(int y=0; y<R; y++) {
			for(int x=0; x<C; x++) {
				map[y][x]=copyMap[y][x];
			}
		}
	}

}
