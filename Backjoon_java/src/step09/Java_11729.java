package step09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11729 {
	// 5. 하노이 탑 이동 순서
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		
		sb.append((int)(Math.pow(2, N)-1)).append("\n");
		
		hanoi(N,1,2,3);
		
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void hanoi(int n, int A, int B, int C) {
		// TODO Auto-generated method stub
		if(n==1) {
			sb.append(A).append(" ").append(C).append("\n");
			return;
		}
		
		hanoi(n-1, A, C, B);

		sb.append(A).append(" ").append(C).append("\n");
		
		hanoi(n-1,B,A,C);
	}

}
