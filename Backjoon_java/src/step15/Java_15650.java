package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_15650 {
	// 1.N과 M (2)
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N, M;
	static int[] arr;
	static boolean[] isVisited;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		arr = new int[M];
		isVisited = new boolean[N];
		dfs(0);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void dfs(int depth) {
		if(depth==M) {
			for(int b : arr) sb.append(b).append(" ");
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++) {
			if(!isVisited[i]) {
				arr[depth]=i+1;
				isVisited[i]=true;
				dfs(depth+1);
				for(int j=i+1; j<N; j++) isVisited[j]=false;
			}
		}
	}

}
