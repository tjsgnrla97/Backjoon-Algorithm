package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11653 {
	//3. 소인수분해
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		for(int i=2; i<=N; i++) {
			for(;;) {
				if(N%i==0) {
					N /= i;
					sb.append(i).append("\n");
				}
				else break;
			}
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
