package step20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Java_18258 {
	// 1.큐 2
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			String cmd = stk.nextToken();
			switch (cmd) {
			case "push":
				int num = Integer.parseInt(stk.nextToken());
				dq.push(num);
				break;

			case "pop":
				if(dq.isEmpty()) sb.append(-1);
				else sb.append(dq.pollLast());
				sb.append("\n");
				break;
			case "size":
				sb.append(dq.size());
				sb.append("\n");
				break;
			case "empty":
				if(dq.isEmpty()) sb.append(1);
				else sb.append(0);
				sb.append("\n");
				break;
			case "front":
				if(dq.isEmpty()) sb.append(-1);
				else sb.append(dq.peekLast());
				sb.append("\n");
				break;
			case "back":
				if(dq.isEmpty()) sb.append(-1);
				else sb.append(dq.peekFirst());
				sb.append("\n");
				break;
			}
		}
		sb.append("\n");
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();

	}

}
