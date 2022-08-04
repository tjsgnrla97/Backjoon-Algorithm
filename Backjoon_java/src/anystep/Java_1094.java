package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1094 {
	// 막대기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int X = Integer.parseInt(in.readLine());
		int current = 64;
		int cnt=0;
		while(X>0) {
			if(current>X) current/=2;
			else {
				cnt++;
				X-=current;
			}
		}
		out.write(cnt+"");
		out.flush();
		out.close();
		in.close();
	}

}
