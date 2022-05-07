package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10989 {
	// 3. 수 정렬하기 3
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N;
	static int[] count = new int[10001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		for(int i=0; i<N; i++) {
			count[Integer.parseInt(in.readLine())]++;
		}
		for(int i=1; i<10001; i++) {
			while(count[i]>0) {
				sb.append(i).append("\n");
				count[i]--;
			}
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
