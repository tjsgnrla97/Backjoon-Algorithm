package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_3109 {
	
	//빵집
	//1차풀이
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer stk;
	
	static int[][] map;
	static int y,x,cnt;
	static int[] dy = {-1, 0, 1};
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		y = Integer.parseInt(stk.nextToken());
		x = Integer.parseInt(stk.nextToken());
		
		map = new int[y][x];
		
		for(int i=0; i<y; i++) {
			String[] input = in.readLine().split("");
			for(int j=0; j<x; j++) {
				if(input[j].equals(".")) {
					map[i][j] = 0;
				}else {
					map[i][j] = 1;
				}
			}
		}
		cnt = 0;
		
		for(int i=0; i<y; i++) dfs(i, 0);
		System.out.println(cnt);
	}
	private static boolean dfs(int yi, int xi) {
		for(int i=0; i<3; i++) {
			int ny = yi + dy[i];
			int nx = xi+1;
			
			if(ny < 0 || nx < 0 || ny>= y || nx >=x) continue;
			if(map[ny][nx]==0) {
				if(nx == x-1) {
					map[ny][nx] = 2;
					cnt++;
					return true;
				}
				map[ny][nx]=2;
				if(dfs(ny,nx)) {
					return true;
				}
			}
		}
		return false;
	}
	//또 다른 정답코드 검색 후 비교
//	static int R, C, cnt; // 행,렬
//	static boolean root;
//	static char map[][]; // 입력받는 map
//	static int dy[] = { -1, 0, 1 }; // 우상, 우, 우하
//	static int dx[] = { 1, 1, 1 };
//
//	// 범위 체크
//	public static boolean isValid(int row, int col) {
//		if (row < 0 || row >= R || col < 0 || col >= C) {
//			return false;
//		}
//		return true;
//	}
//
//	private static void dfs(int row, int col) {
//
//		if (col == C - 1) {
//			root = true;
//			cnt++;
//			return;
//
//		}
//
//		// 3방 탐색
//		for (int k = 0; k < 3; k++) {
//			int nextRow = row + dy[k];
//			int nextCol = col + dx[k];
//
//			// 범위 && 파이프 자리 검사
//			if (isValid(nextRow, nextCol) && map[nextRow][nextCol] == '.') {
//				map[row][col] = 'x';
//				dfs(nextRow, nextCol);
//				if (root) {
//					return;
//				}
//			}
//		}
//
//	}
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuilder sb = new StringBuilder();
//		StringTokenizer st = new StringTokenizer(br.readLine());
//
//		// input
//		R = Integer.parseInt(st.nextToken());
//		C = Integer.parseInt(st.nextToken());
//		map = new char[R][C];
//
//		for (int i = 0; i < R; i++) {
//			map[i] = br.readLine().toCharArray();
//		}
//		// end of input;
//
//		for (int i = 0; i < R; i++) {
//			root = false;
//			dfs(i, 0);
//		}
//
//		// output
//		sb.append(cnt);
//		bw.write(sb + " ");
//		bw.flush();
//		bw.close();
//		br.close();
//
//	} // end of main
}
