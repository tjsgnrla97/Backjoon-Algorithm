package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2920 {
	// 음계
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		int[] arr = new int[8];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<8; i++) arr[i] = Integer.parseInt(stk.nextToken());
		String ans="";
		for(int i=0; i<7; i++) {
			if(arr[i+1] == arr[i]+1) ans = "ascending";
			else if(arr[i+1] == arr[i]-1) ans = "descending";
			else {
				ans = "mixed";
				break;
			}
		}
		System.out.println(ans);
	}

}
