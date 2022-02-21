package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Java_1759 {
	// 암호 만들기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int L,C;
	static char key[], ans[];
	static boolean isSelected;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		L = Integer.parseInt(stk.nextToken());
		C = Integer.parseInt(stk.nextToken());
		key = new char[C];
		ans = new char[L];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<C; i++) key[i]=stk.nextToken().charAt(0);
		Arrays.sort(key);
		comb(0,0,0,0);
		System.out.println(sb);
	}
	private static void comb(int cnt, int idx, int mo, int ja) {
		if(cnt==L) {
			if(mo>=1 && ja >=2) {
				for(int i=0; i<L; i++) {
					sb.append(ans[i]);
				}
				sb.append("\n");
			}
			return;
		}
		for(int i=idx; i<C; i++) {
			ans[cnt]=key[i];
			if(key[i]=='a'||key[i]=='e'||key[i]=='i'||key[i]=='o'||key[i]=='u') comb(cnt+1,i+1,mo+1,ja);
			else comb(cnt+1, i+1, mo, ja+1);
		}
	}

}
