package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_15683 {
	// 감시
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N,M,CN,ans=Integer.MAX_VALUE;
	static int[][] map;
	static int[] dy= {0,1,0,-1}, dx= {1,0,-1,0};
	static class CCTV{
		int y, x, type;
		int[] dir;
		public CCTV(int y, int x, int type) {
			super();
			this.y = y;
			this.x = x;
			this.type = type;
			
			if(type==1) {
				this.dir = new int[1];
				dir[0]=0;
			}
			else if(type==2) {
				this.dir = new int[2];
				dir[0]=0;
				dir[1]=2;
			}
			else if(type==3) {
				this.dir = new int[2];
				dir[0]=0;
				dir[1]=3;
			}
			else if(type==4) {
				this.dir = new int[3];
				dir[0]=0;
				dir[1]=2;
				dir[2]=3;
			}
			else if(type==5) {
				this.dir = new int[4];
				dir[0]=0;
				dir[1]=1;
				dir[2]=2;
				dir[3]=3;
			}
		}
	}
	static List<CCTV> cctvs = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N= Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		map = new int[N][M];
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<M; x++) {
				map[y][x] = Integer.parseInt(stk.nextToken());
				if(map[y][x]>=1 && map[y][x]<=5) {
					cctvs.add(new CCTV(y, x, map[y][x]));
				}
			}
		}
		CN = cctvs.size();
		dfs(0);
		out.append(ans+"");
		in.close();
		out.flush();
		out.close();
	}
	private static void dfs(int depth) {
		//cctv 개수와 같아지면
		if(depth == CN) {
			//임시로 사용할 복제맵
			int[][] copyMap = new int[N][M];
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					copyMap[i][j] = map[i][j];
				}
			}
			//감시영역 체크
			copyMap = CCTVvision(copyMap);
			//0의 개수 체크
			int sum=0;
			for(int y=0; y<N; y++) {
				for(int x=0; x<M; x++) {
					if(copyMap[y][x]==0) sum++;
				}
			}
//			for(int y=0; y<N; y++) {
//				for(int x=0; x<M; x++) {
//					System.out.print(copyMap[y][x]);
//				}
//				System.out.println();
//			}
			//최소값 갱신
			ans = Math.min(ans, sum);
		}
		//cctv들 탐색
		else {
			CCTV cctv;
			cctv = cctvs.get(depth);
			
			int[] temp = cctv.dir.clone();
			if(cctv.type==1 || cctv.type==3 || cctv.type==4) {
				for(int d=0; d<4; d++) {
					for(int i=0; i<cctv.dir.length; i++) {
						cctv.dir[i] += d;
						//인덱스가 배열크기를 벗어나지 않게 하기 위함
						cctv.dir[i] = cctv.dir[i]%4;
					}
					dfs(depth+1);
					//cctv 방향 초기화
					cctv.dir = temp.clone();
				}
			}
			else if(cctv.type==2) {
				for(int d=0; d<2; d++) {
					for(int i=0; i<cctv.dir.length; i++) {
						cctv.dir[i] += d;
						cctv.dir[i] = cctv.dir[i]%4;
					}
					dfs(depth+1);
					cctv.dir = temp.clone();
				}
			}
			else if(cctv.type==5) {
				dfs(depth+1);
				cctv.dir = temp.clone();
			}
		}
	}
	private static int[][] CCTVvision(int[][] map) {
		CCTV cctv;
		int cy, cx;
		int ny, nx;
		for(int i=0; i<cctvs.size(); i++) {
			cctv= cctvs.get(i);
			
			cy= cctv.y;
			cx= cctv.x;
			
			int dir;
			for(int j=0; j<cctv.dir.length; j++) {
				dir=cctv.dir[j];
				
				ny=cy;
				nx=cx;
				while(true) {
					ny+=dy[dir];
					nx+=dx[dir];
					if(isRange(ny,nx)) {
						if(map[ny][nx]==0) {
							map[ny][nx]=7;
						}
						else if(map[ny][nx]==6) break;
					}
					else {
						break;
					}
				}
			}
		}
		return map;
	}
	private static boolean isRange(int ny, int nx) {
		if(ny<0||ny>=N||nx<0||nx>=M) return false;
		return true;
	}

}
