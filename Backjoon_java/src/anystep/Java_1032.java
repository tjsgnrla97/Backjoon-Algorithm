package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1032 {
	// 명령프롬프트
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		String[] log = new String[N];
		for(int i=0; i<N; i++) log[i] = in.readLine();
		
		boolean isEqual = true;
		for(int i=0; i<log[0].length(); i++) {
			char current = log[0].charAt(i);
			
			isEqual=true;
			for(int j=1; j<N; j++) {
				if(current != log[j].charAt(i)) {
					isEqual=false;
					break;
				}
			}
			if(isEqual==true) sb.append(current);
			else sb.append("?");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
