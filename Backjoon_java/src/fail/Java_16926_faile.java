package fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_16926_faile {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb=new StringBuilder();
	static int N, M, R;
	//하 우 상 좌
	static int[] dy= {1,0,-1,0};
	static int[] dx= {0,1,0,-1};
	static int[][] arr;
	public static void main(String[] args) throws IOException {
		stk=new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		R = Integer.parseInt(stk.nextToken());
		arr = new int[N][M];
		for(int n=0; n<N; n++) {
			stk=new StringTokenizer(in.readLine());
			for(int m=0; m<M; m++) {
				arr[n][m] = Integer.parseInt(stk.nextToken());
			}
		}
		int quadNum= Math.min(N, M)/2;
		for(int i=0; i<R; i++) {
			rotate(quadNum);
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				sb.append(arr[i][j]+" ");
			}
			sb.append("\n");
		}
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
//		for(int[] b : arr) System.out.println(Arrays.toString(b)); System.out.println();
	}
	private static void rotate(int quadNum) {
		for(int i=0; i<quadNum; i++) {
			int startY=i;
			int startX=i;
			int d=0;
			int temp = 0;
			while(d<4) {
				int nx = startX + dx[d];
				int ny = startY + dy[d];
				if(ny>=i && nx>=i && ny< N-i && nx<M-i) {
					if(startX==i&&startY==i) {
						temp=arr[ny][nx];
						arr[ny][nx]=arr[startY][startX];
					}	
					else {
						int temp2=temp;
						temp=arr[ny][nx];
						arr[ny][nx]=temp2;
					}
					startX=nx;
					startY=ny;
				}else {
					d++;
				}
			}
		}
	}
}
