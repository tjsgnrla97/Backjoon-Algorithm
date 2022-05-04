package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1513 {
	// 경로 찾기
	//메모리 49840KB 시간 272ms
	//풀이 시간 2시간 56분
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M,C;
	static final int mod = 1000007;
	static int[][][][] dp; //[y][x][현재 좌표 오락실 번호][통과한 오락실 개수] = 경로 개수
	static int[][] map;
	public static void main(String[] args) throws IOException {
		input();
		dp();
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void dp() {
		for(int y=1; y<=N; y++) {
			for(int x=1; x<=M; x++) {
				if(y==1 && x==1) continue;
				if(map[y][x]>0) { //오락실 좌표일 경우
					for(int c=0; c<map[y][x]; c++) { // 방문한 최대 오락실 번호
						for(int d=0; d<=c; d++) { //방문 오락실 개수
							dp[y][x][map[y][x]][d+1] += dp[y-1][x][c][d]+dp[y][x-1][c][d];
							dp[y][x][map[y][x]][d+1] %= mod;
						}
					}
				}
				else {
					for(int c=0; c<=C; c++) {
						for(int d=0; d<=c; d++) {
							dp[y][x][c][d] = dp[y-1][x][c][d]+dp[y][x-1][c][d];
							dp[y][x][c][d] %= mod;
						}
					}
				}
			}
		}
		for(int i=0; i<=C; i++) {
			int sum = 0;
			for(int j=0; j<=C; j++) {
				sum += dp[N][M][j][i]; //방문 개수 별 경로 수 총 합계
			}
			sum %= mod;
			sb.append(sum).append(" ");
		}
	}
	private static void input() throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		C = Integer.parseInt(stk.nextToken());
		map = new int[N+1][M+1];
		dp = new int[51][51][51][51];
		dp[1][1][0][0]=1;
		for(int c=1; c<=C; c++) {
			stk = new StringTokenizer(in.readLine());
			int y = Integer.parseInt(stk.nextToken());
			int x = Integer.parseInt(stk.nextToken());
			if(y==1 && x==1) {
				dp[1][1][0][0]=0;
				dp[1][1][c][1]=1;
			}
			map[y][x]=c;
		}
	}

}
