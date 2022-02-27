package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_8958 {
	// 6.OX퀴즈
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int T;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T=Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			String s = in.readLine();
			char[] arr = new char[s.length()];
			int ans=0;
			int res=0;
			for(int i=0; i<s.length(); i++) {
				arr[i]=s.charAt(i);
				if(arr[i]=='O') res++;
				else if(arr[i]=='X') res=0;
				ans+=res;
			}
			sb.append(ans).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
