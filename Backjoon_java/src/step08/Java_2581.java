package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2581 {
	//2.소수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int M,N,sum,min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		M = Integer.parseInt(in.readLine());
		N = Integer.parseInt(in.readLine());
		min = N;
		x:for(int i=M; i<=N; i++) {
			if(i==1) continue;
			for(int j=2; j<i; j++) {
				if(i%j==0) continue x;
			}
			sum+=i;
			if(min>i) min=i;
		}
		if(sum==0) sb.append(-1).append("\n");
		else sb.append(sum).append("\n").append(min);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
