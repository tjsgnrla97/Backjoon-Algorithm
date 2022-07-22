package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1212 {
	// 8진수 2진수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str = in.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int number = str.charAt(i)-'0';
			if(number>=4) {
				sb.append(1);
				number-=4;
			}else {
				sb.append(0);
			}
			if(number>=2) {
				sb.append(1);
				number-=2;
			}else {
				sb.append(0);
			}
			if(number==1) {
				sb.append(1);
				number-=1;
			}else {
				sb.append(0);
			}
		}
		
		if(str.charAt(0)=='1' || str.charAt(0)=='0') sb.delete(0, 2);
		else if(str.charAt(0)=='2'||str.charAt(0)=='3') sb.deleteCharAt(0);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
