package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1009 {
	// 분산처리
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		int a,b,r;
		for(int tc=1; tc<=T; tc++) {
			stk = new StringTokenizer(in.readLine());
			a = Integer.parseInt(stk.nextToken());
			b = Integer.parseInt(stk.nextToken());
			r=1;
			
			for(int i=0; i<b; i++) r = (r*a)%10;
			if(r==0) r=10;
			System.out.println(r);
		}
	}

}
