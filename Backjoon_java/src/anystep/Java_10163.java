package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10163 {
	// 색종이
//	백준 문제 해설의 그림을 시계방향으로 90도 돌려서 생각해봐야한다.
//	입력으로 받는 왼쪽아래기준이 90도가 돌아가면 왼쪽위로 돌아가게 된다.
//	즉 이중for문으로 2차원 배열로 입력을 받기 편해진다.
//	i 초기값을 0으로하면 i+1 1로하면 i를 배열의 값으로 받아들이고 카운트시 해당 종이순번과 같을경우만 증가시켜준다.
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int N;
	static int paint[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		N= Integer.parseInt(in.readLine());
		paint = new int[1001][1001];
		for(int num=1; num<=N; num++) {
			stk=new StringTokenizer(in.readLine());
			int startY = Integer.parseInt(stk.nextToken());
			int startX = Integer.parseInt(stk.nextToken());
			int height = Integer.parseInt(stk.nextToken());
			int weight = Integer.parseInt(stk.nextToken());
			for(int y=startY; y<startY+height; y++) {
				for(int x=startX; x<startX+weight; x++) {
					paint[y][x]=num;
				}
			}
		}
		for(int num=1; num<=N; num++) {
			int cnt = 0;
			for(int y=0; y<1001; y++) {
				for(int x=0; x<1001; x++) {
					if(paint[y][x]==num) cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
}
