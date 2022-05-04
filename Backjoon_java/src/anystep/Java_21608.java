package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Java_21608 {
	// 상어 초등학교
	// 문제 지문 이해를 제대로 못한건지 설계가 틀린건지 원하는 출력값을 도출하는데 실패
	// Solution 1.
	// 1. 비어있는 칸 중에서 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리를 정한다.
	// 2. 1을 만족하는 칸이 복수일 경우, 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리를 정한다.
	// 3. 2를 만족하는 칸도 복수일 경우, 행의 번호가 가장 작은 칸, 그것도 복수일 경우 열의 번호가 가장 작은 칸으로 정한다.
	// 논리적으로 설계가 틀린건 아닌 것 같으나 구현 과정이 어려워서 틀린 것 같습니다.
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int[][] map, nearCnt;
	static int N,N2,ans;
	static int[] dy = {-1, 1, 0, 0};
	static int[] dx = {0, 0, -1, 1};
	
	static class Student{
		int y,x;
		int[] friedList;
		public Student(int y, int x, int[] friedList) {
			super();
			this.y = y;
			this.x = x;
			this.friedList = friedList;
		}
		
	}
	
	static Map<Integer,Student> studentList = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
		for(int i=1; i<=N2; i++) {
			Student student = studentList.get(i);
			int cnt=0;
			for(int friend : student.friedList) {
				if(Math.abs(studentList.get(friend).y-student.y)+Math.abs(studentList.get(friend).x-student.x)==1){
					cnt++;
				}
			}
			if(cnt==1) ans+=1;
			else if(cnt==2) ans+=10;
			else if(cnt==3) ans+=100;
			else if(cnt==4) ans+=1000;
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		N2 = N*N;
		map = new int[N][N];
		nearCnt = new int[N][N];
		for(int y=0; y<N; y++) {
			for(int x=0; x<N; x++) {
				int cnt=4;
				if(y==0 || y==N-1) cnt--;
				if(x==0 || x==N-1) cnt--;
				nearCnt[y][x]=cnt;
			}
		}
		for(int i=0; i<N2; i++) {
			stk = new StringTokenizer(in.readLine());
			int num = Integer.parseInt(stk.nextToken());
			int one = Integer.parseInt(stk.nextToken());
			int two = Integer.parseInt(stk.nextToken());
			int three = Integer.parseInt(stk.nextToken());
			int four = Integer.parseInt(stk.nextToken());
			
			findSeat(num, new int[] {one, two, three, four});
		}
	}
	private static void findSeat(int num, int[] friends) {
		int[][] nearFriedCnt = new int[N][N];
		for(int friend : friends) {
			if(studentList.containsKey(friend)) {
				Student student = studentList.get(friend);
				int y = student.y;
				int x = student.x;
				
				for(int d=0; d<4; d++) {
					int ny = y + dy[d];
					int nx = x + dx[d];
					if(isPossible(ny,nx)) continue;
					nearFriedCnt[ny][nx]++;
				}
			}
		}
		int emptyNearMax = -1;
		int nearFriedMax = -1;
		int selectY = -1;
		int selectX = -1;
		
		for(int y=0; y<N; y++) {
			for(int x=0; x<N; x++) {
				if(map[y][x] != 0) continue;
				if(nearFriedMax < nearFriedCnt[y][x]) {
					selectY = y;
					selectX = x;
					nearFriedMax = nearFriedCnt[y][x];
					emptyNearMax = nearCnt[y][x];
				}
				else if(nearFriedMax == nearFriedCnt[y][x] && emptyNearMax < nearCnt[y][x]) {
					emptyNearMax = nearCnt[y][x];
					selectY = y;
					selectX = x;
				}
			}
		}
		
		map[selectY][selectX] = num;
		studentList.put(num, new Student(selectY, selectX, friends));
		
		for(int d=0; d<4; d++) {
			int ny = selectY+dy[d];
			int nx = selectX+dx[d];
			if(isPossible(ny, nx)) continue;
			nearCnt[ny][nx]--;
		}
	}
	private static boolean isPossible(int ny, int nx) {
		if(ny<0 || ny>=N || nx<0 || nx>=N || map[ny][nx] !=0) return true;
		return false;
	}

}
