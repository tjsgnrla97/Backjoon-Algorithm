package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1987 {
	/*
	 * //런타임 에러 : 스택오버플로우 예상으로는 스테틱변수가 많아서 그런건가 싶습니다.
	 *아래에 다시 짠 코드랑 비교해서 별다를 게 없는데 이 코드만 스택오버플로우가 뜹니다.
	 *
	 *원인 해결 : 망할 이클립스의 자동완성기능 떄문에 라인 58의 배열인덱스가 [ny][ny]로 넘어가면서
	 *재귀의 늪에 빠진것이 원인이었습니다 ㅠㅠㅠㅠ
	 */
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	
	static int Y,X,ans;
	static char[][] board;
	static boolean[] isVisited;
	static int[] dy = {-1,1,0,0};
	static int[] dx = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		ans=0;
		stk = new StringTokenizer(in.readLine());
		Y=Integer.parseInt(stk.nextToken());
		X=Integer.parseInt(stk.nextToken());
		board = new char[Y][X];
		isVisited = new boolean[26]; //알파벳 개수 대소문자 구분x 26개
//		System.out.println(Y+" "+X);
		for(int i=0; i<Y; i++) {
			String str = in.readLine();
			for(int j=0; j<X; j++) {
				board[i][j] = str.charAt(j);
//				System.out.println(board[i][j]);
			}
		}
		
		isVisited[board[0][0]-'A']=true;
		dfs(0,0,1); //초기위치 cnt 체크
		out.append(ans+"");
		in.close();
		out.flush();
		out.close();
	}
	private static void dfs(int y, int x, int cnt) {
		
		for(int d=0; d<4; d++) {
			int ny = y+dy[d];
			int nx = x+dx[d];
			
			if(ny>=0 && nx>=0 && ny<Y && nx <X) {
				if(!isVisited[board[ny][nx]-'A']) {
					isVisited[board[ny][nx]-'A'] = true;
					dfs(ny, nx, cnt+1);
					
				}
			}
		}
		isVisited[board[y][x]-'A'] = false;
		ans = Math.max(ans, cnt);
	}
//	static int ans = 0, Y, X;
//	static char[][] board;
//	static boolean[] isVisited = new boolean[26];
//
//	public static void main(String[] args) throws Exception {
////		Scanner sc = new Scanner(System.in);
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer stk = new StringTokenizer(in.readLine());
//		Y = Integer.parseInt(stk.nextToken());
//		X = Integer.parseInt(stk.nextToken());
//		board = new char[Y][X];
//		for (int i = 0; i < Y; i++) {
//			String temp = in.readLine();
//			for (int j = 0; j < X; j++) {
//				board[i][j] = temp.charAt(j);
//			}
//		}
//		dfs(0, 0, 1);
//		out.append(ans+"");
//		in.close();
//		out.flush();
//		out.close();
//	}
//
//	static void dfs(int x, int y, int cnt) {
//		int[] dx = { 1, -1, 0, 0 };
//		int[] dy = { 0, 0, 1, -1 };
//		isVisited[board[x][y] - 'A'] = true;
//		for (int i = 0; i < 4; i++) {
//			int ny = y + dy[i];
//			int nx = x + dx[i];
//			if (0 <= ny && ny < Y && 0 <= nx && nx < X) {
//				if (!isVisited[board[ny][nx] - 'A']) {
//					dfs(ny, nx, cnt + 1);
//				}
//			}
//		}
//		isVisited[board[x][y] - 'A'] = false;
//		ans = Math.max(ans, cnt);
//	}

}
