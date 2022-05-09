package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1427 {
	// 5.소트인사이드
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static String N;
	static char[] str;
	public static void main(String[] args) throws IOException {
		N = in.readLine();
		str = N.toCharArray();
		Arrays.sort(str);
		
		//내림차순
		for(int i=str.length-1; i>=0; i--) {
			sb.append(str[i]);
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
