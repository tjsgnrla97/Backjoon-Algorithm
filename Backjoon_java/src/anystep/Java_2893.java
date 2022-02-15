package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2893 {
	// 설탕 배달
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N, ans, cnt;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N=Integer.parseInt(in.readLine());
		calcAns(N);
		out.append(ans+"");
		in.close();
		out.flush();
		out.close();
	}
	private static void calcAns(int n) {
		while(true) {
			if(n%5==0) {
				ans += n/5;
				break;
			}
			else {
				if(n<3) {
					ans = -1;
					break;
				}
				n -=3;
				ans++;
			}
		}
	}

}
