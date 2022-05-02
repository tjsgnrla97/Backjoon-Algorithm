package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2751 {
	// 2. 수 정렬하기 2
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int[] arr;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(in.readLine());
		}
		Arrays.sort(arr);
		for(int i=0; i<N; i++) {
			sb.append(arr[i]).append("\n");
		}
		sb.setLength(sb.length()-1);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
