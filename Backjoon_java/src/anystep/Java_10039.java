package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10039 {
	// 평균 점수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int ans;
	public static void main(String[] args) throws NumberFormatException, IOException {
		for(int i=0; i<5; i++) {
			int a = Integer.parseInt(in.readLine());
			if(a<40) a=40;
			ans+=a;
		}
		ans /= 5;
		System.out.println(ans);
	}

}
