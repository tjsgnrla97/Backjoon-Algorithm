package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1373 {
	// 2진수 8진수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		String num = in.readLine();
		if(num.length()%3==1) sb.append(num.charAt(0));
		if(num.length()%3==2) sb.append((num.charAt(0)-'0')*2+(num.charAt(1)-'0'));
		for(int i=num.length()%3; i<num.length(); i+=3) {
			sb.append((num.charAt(i)-'0')*4+(num.charAt(i+1)-'0')*2+(num.charAt(i+2)-'0'));
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
