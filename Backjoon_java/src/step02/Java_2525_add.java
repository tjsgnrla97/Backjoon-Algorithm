package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_2525_add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 추가1. 오븐시계
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(in.readLine());
		int h = Integer.parseInt(stk.nextToken());
		int m = Integer.parseInt(stk.nextToken());
		int add = Integer.parseInt(in.readLine());
		int mRes=m+add;
		int hRes=h;
		if(mRes>=60) {
			hRes+=mRes/60;
			mRes%=60;
		}
		if(hRes>=24) {
			hRes%=24;
		}
		System.out.println(hRes+" "+mRes);
	}

}
