package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_4948 {
	// 베르트랑 공준
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		while(true) {
			int n = Integer.parseInt(in.readLine());
			if(n==0) break;
			int cnt=0;
			
			for(int i=n+1; i<=2*n; i++) {
				if(isPrime(i)) cnt++;
			}
			System.out.println(cnt);
		}

	}
	private static boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
