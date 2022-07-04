package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10797 {
	// 10부제
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		
		stk = new StringTokenizer(in.readLine());
		
		int car=0;
		int ans=0;
		
		for(int i=0; i<5; i++) {
			car = Integer.parseInt(stk.nextToken());
			if(N==car) ans++;
		}
		System.out.println(ans);
	}

}
