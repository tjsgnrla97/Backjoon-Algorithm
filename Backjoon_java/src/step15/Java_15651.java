package step15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_15651 {
	// N과 M(3)
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M;
	static boolean[] isSelected;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		input();
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
			isSelected[i]=true;
			arr[depth]=i+1;
			dfs(depth+1);
			isSelected[i]=false;
		}
	}
	private static void input() throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		
		isSelected = new boolean[N];
		arr = new int[M];
	}

}
