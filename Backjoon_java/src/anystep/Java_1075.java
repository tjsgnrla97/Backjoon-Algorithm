package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1075 {
	// 나누기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());
		int f = Integer.parseInt(in.readLine());
		
		int temp = (n/100)*100;
		while(true) {
			if(temp%f==0) {
				int res = temp%100;
				if(res<10) System.out.println("0"+res);
				else System.out.println(res);
				return;
			}
			temp++;
		}
	}

}
