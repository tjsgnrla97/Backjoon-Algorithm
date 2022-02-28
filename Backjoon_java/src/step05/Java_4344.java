package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_4344 {
	//7.평균은 넘겠지
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			stk = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(stk.nextToken());
			double sum=0;
			int cnt=0;
			double ans=0;
			int[] arr = new int[N];
			for(int i=0; i<N; i++) {
				arr[i]=Integer.parseInt(stk.nextToken());
			}
			for(int a : arr) sum+=a;
			sum/=(double)N;
			for(int a : arr) if(a>sum) cnt++;
			ans = cnt/(double)N*100;
			sb.append(String.format("%.3f", ans)).append("%\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
