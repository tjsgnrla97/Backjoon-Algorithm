package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2864 {
	// 5와 6의 차이
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		
		String a = stk.nextToken().replace('6', '5');
		String b = stk.nextToken().replace('6', '5');
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b)+" ");
		a = a.replace('5', '6');
		b = b.replace('5', '6');
		System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
	}

}
