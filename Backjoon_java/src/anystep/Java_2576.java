package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2576 {
	// 홀수
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int sum=0;
		int min=100;
		
		for(int i=0; i<7; i++) {
			int num = Integer.parseInt(in.readLine());
			if(num%2==1) {
				sum+=num;
				min=Math.min(min, num);
			}
		}
		if(sum==0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
