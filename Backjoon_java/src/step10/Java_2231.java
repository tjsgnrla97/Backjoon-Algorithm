package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2231 {
	//2. 분해합
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		ans=0;
		for(int i=1; i<=N; i++) {
			int selectNum = i;
			int res=0;
			while(selectNum!=0) {
				res += selectNum % 10;
				selectNum /= 10;
			}
			if(res+i==N) {
				ans = i;
				break;
			}
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

}
