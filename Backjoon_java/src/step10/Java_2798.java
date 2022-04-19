package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2798 {
	// 1.블랙잭
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N, M, ans;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		input();
		search();
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void search() {
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int temp = arr[i]+arr[j]+arr[k];
					if(M==temp) {
						ans = temp;
						return;
					}
					if(ans<temp && temp<M) ans = temp;
				}
			}
		}
		return;
	}
	private static void input() throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(stk.nextToken());
		arr = new int[N];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(stk.nextToken());
	}

}
