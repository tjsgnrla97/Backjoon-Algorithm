package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10818 {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N;
	static int min=Integer.MAX_VALUE;
	static int max=Integer.MIN_VALUE;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1.최소,최대
		N=Integer.parseInt(in.readLine());
		arr= new int[N];
		stk = new StringTokenizer(in.readLine());
		for(int n=0; n<N; n++) {
			arr[n]=Integer.parseInt(stk.nextToken());
		}
		for(int n=0; n<N; n++) {
			min = Math.min(min, arr[n]);
			max = Math.max(max, arr[n]);
		}
		sb.append(min+" "+max);
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}

}
