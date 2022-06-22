package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10162 {
	// 전자레인지
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		int A = 0;
		int B = 0;
		int C = 0;
		if(T>=300) {
			A = T/300;
			T -= 300*A;
		}
		if(T>=60) {
			B = T/60;
			T -= 60*B;
		}
		if(T%10!=0) {
			System.out.println(-1);
			System.exit(0);
		}
		else {
			C = T/10;
			System.out.println(A+" "+B+" "+C);
		}
	}

}
