package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11557 {
	// Yangjojang of The Year
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(in.readLine());
			String[] str = new String[N];
			int[] num = new int[N];
			String ans="";
			for(int i=0; i<N; i++) {
				stk = new StringTokenizer(in.readLine());
				str[i] = stk.nextToken();
				num[i] = Integer.parseInt(stk.nextToken());
			}
			
			int max=0;
			String anx = "";
			for(int i=0; i<N; i++) {
				if(max<num[i]) {
					max = num[i];
					ans = str[i];
				}
			}
			out.write(ans+"\n");
		}
		out.flush();
		out.close();
		in.close();
	}

}
