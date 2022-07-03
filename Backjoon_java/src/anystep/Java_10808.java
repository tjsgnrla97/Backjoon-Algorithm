package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10808 {
	// 알파벳 개수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		int[] alpha = new int[26];
		
		String str = in.readLine();
		
		for(int i=0; i<str.length(); i++) {
			alpha[(int)str.charAt(i)-97] += 1;
		}
		
		for(int i=0; i<alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		System.out.println(sb);
	}

}
