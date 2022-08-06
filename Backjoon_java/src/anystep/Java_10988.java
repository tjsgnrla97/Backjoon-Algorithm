package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10988 {
	// 팰린드롬인지 확인하기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		String str = in.readLine();
		int ans = 1;
		for(int i=str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			
			if(c != str.charAt(str.length()-i-1)) {
				ans = 0;
				break;
			}
		}
		out.write(ans+"\n");
		out.flush();
		out.close();
		in.close();
	}

}
