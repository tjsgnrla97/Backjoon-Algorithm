package step08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Java_1978 {
	// 1.소수 찾기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int ans;
	public static void main(String[] args) throws IOException {
		in.readLine();
		stk = new StringTokenizer(in.readLine());
		while(stk.hasMoreTokens()) {
			int num = Integer.parseInt(stk.nextToken());
			if(isPrime(num)) ans++;
		}
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<=sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		return true;
	}

}
