package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1193 {
	//3. 분수찾기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N=Integer.parseInt(in.readLine());
		int line=0;
		int cnt=0;
		while(cnt<N) {
			line++;
			cnt=line * (line+1) / 2;
		}
		if(line%2!=0) {
			int top = 1+(cnt-N);
			int bottom = line - (cnt-N);
			sb.append(top).append("/").append(bottom);
		}else {
			int top = line - (cnt-N);
			int bottom = 1+(cnt-N);
			sb.append(top).append("/").append(bottom);
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
