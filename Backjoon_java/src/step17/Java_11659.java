package step17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11659 {
	// 1. 구간 합 구하기 4
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		arr = new int[N+1];
		stk = new StringTokenizer(in.readLine());
		for(int i=1; i<=N; i++) arr[i]=arr[i-1]+Integer.parseInt(stk.nextToken());
		for(int i=0; i<M; i++) {
			stk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			System.out.println(arr[b]-arr[a-1]);
		}
	}

}
