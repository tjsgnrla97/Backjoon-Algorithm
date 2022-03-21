package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1152 {
	// 6. 단어의 개수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		String[] str = in.readLine().split(" ");
		int cnt=0;
		for(int i=0; i<str.length; i++) if(str[i]=="") cnt++;
		out.write(str.length-cnt+"");
		out.flush();
		out.close();
		in.close();
	}

}
