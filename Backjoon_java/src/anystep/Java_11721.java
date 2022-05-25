package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11721 {
	// 열 개씩 끊어 출력하기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		String str = in.readLine();
		int n = str.length()/10;
		int idx = 0;
		for(int i=0; i<n; i++) {
			System.out.println(str.substring(idx,idx+10));
			idx+=10;
		}
		n=str.length()%10;
		System.out.println(str.substring(str.length()-n));
	}

}
