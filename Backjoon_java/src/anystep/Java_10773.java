package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_10773 {
	// 제로
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int K;
	public static void main(String[] args) throws NumberFormatException, IOException {
		K = Integer.parseInt(in.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<K; i++) {
			int num = Integer.parseInt(in.readLine());
			if(num==0) {
				stack.pop();
			}
			else stack.push(num);
		}
		int sum=0;
		for(int num : stack) sum+=num;
		System.out.println(sum);
	}

}
