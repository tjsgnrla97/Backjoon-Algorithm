package step05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2577 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static String[] ans;
	static int[] cnt = new int[10];
	public static void main(String[] args) throws NumberFormatException, IOException {
		//3.숫자의 개수
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		int C = Integer.parseInt(in.readLine());
		int res = A*B*C;
		String a = res+"";
		ans = a.split("");
		for(int i=0; i<ans.length; i++) {
			switch (ans[i]) {
			case "0": cnt[0]++; break;
			case "1": cnt[1]++; break;
			case "2": cnt[2]++; break;
			case "3": cnt[3]++; break;
			case "4": cnt[4]++; break;
			case "5": cnt[5]++; break;
			case "6": cnt[6]++; break;
			case "7": cnt[7]++; break;
			case "8": cnt[8]++; break;
			case "9": cnt[9]++; break;
			}
		}
		for(int i=0; i<10; i++) sb.append(cnt[i]+"\n");
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}

}
