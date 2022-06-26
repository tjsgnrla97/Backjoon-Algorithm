package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_9012 {
	// 괄호
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			String str = in.readLine();
			for(int j=0; j<str.length(); j++) {
				char current = str.charAt(j);
				if(current == '(') stack.push(current);
				else {
					int size = stack.size();
					if(size == 0) {
						stack.push(current);
						break;
					}
					else stack.pop();
				}
			}
			
			if(stack.isEmpty()) System.out.println("YES");
			else System.out.println("NO");
			stack.clear();
		}
	}

}
