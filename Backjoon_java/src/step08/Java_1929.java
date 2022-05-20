package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1929 {
	// 4.소수 구하기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int M,N;
	static boolean[] arr;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		M = Integer.parseInt(stk.nextToken());
		N = Integer.parseInt(stk.nextToken());
		arr = new boolean[N+1];
		arr[0]=arr[1]=true; //0과 1은 소수에서 제외
		//에라토스테네스 체 사용
		int sqrt = (int) Math.sqrt(N);
		for(int i=2; i<=sqrt; i++) {
			for(int j=2; j<=N/i; j++) {
				if(arr[i*j]) continue;
				else arr[i*j]=true;
			}
		}
		for(int i=M; i<=N; i++) {
			if(!arr[i]) sb.append(i).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
