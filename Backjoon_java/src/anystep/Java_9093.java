package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_9093 {
	// 단어 뒤집기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());

		while(n-->0) {
			Stack<Character> stack = new Stack<>();
			String str = in.readLine()+"\n";
			for(char ch : str.toCharArray()) {
				if(ch==' ' || ch=='\n') {
					while(!stack.isEmpty()) out.write(stack.pop());
					out.write(ch);
				}
				else stack.push(ch);
			}
		}
		out.flush();
		out.close();
		in.close();
	}

}
