package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2740 {
	// 행렬 곱셈
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		
		int N = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		
		int[][] A = new int[N][M];
		for(int y=0; y<N; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<M; x++) {
				A[y][x] = Integer.parseInt(stk.nextToken());
			}
		}
		
		stk = new StringTokenizer(in.readLine());
		
		stk.nextToken();
		int K = Integer.parseInt(stk.nextToken());
		
		int[][] B = new int[M][K];
		
		for(int y=0; y<M; y++) {
			stk = new StringTokenizer(in.readLine());
			for(int x=0; x<K; x++) {
				B[y][x] = Integer.parseInt(stk.nextToken());
			}
		}
		
		for(int y=0; y<N; y++) {
			for(int x=0; x<K; x++) {
				int sum=0;
				for(int k=0; k<M; k++) {
					sum += A[y][k] * B[k][x];
				}
				sb.append(sum).append(" ");
			}
			sb.append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
