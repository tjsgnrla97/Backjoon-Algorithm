package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1065 {
	// 3.한수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = Integer.parseInt(in.readLine());
		int ans = arithmetic_sequence(num);
		out.append(Integer.toString(ans));
		out.flush();
		out.close();
		in.close();
	}
	private static int arithmetic_sequence(int num) {
		int ans = 0;
		if(num<100) return num;
		else {
			ans=99;
			if(num==1000) num=999;
			for(int i=100; i<=num; i++) {
				int hun = i / 100;
				int ten = (i/10)%10;
				int one = i%10;
				
				if((hun-ten)==(ten-one)) ans++;
			}
		}
		return ans;
	}

}
