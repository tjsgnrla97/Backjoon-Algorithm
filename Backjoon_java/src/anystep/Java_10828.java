package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_10828 {
	//스택
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			String str = stk.nextToken();
			switch (str) {
			case "push":
				stack.push(Integer.parseInt(stk.nextToken()));
				break;
			case "pop":
				if(!stack.empty()) sb.append(stack.pop()).append("\n");
				else sb.append(-1).append("\n");
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				if(!stack.empty()) sb.append(0).append("\n");
				else sb.append(1).append("\n");
				break;
			default:
				if(!stack.empty()) sb.append(stack.peek()).append("\n");
				else sb.append(-1).append("\n");
				break;
			}
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
