package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Java_1158 {
	static Queue<Integer> yosebArr = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		// 요세푸스 문제
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
	
		for(int i=0; i<N; i++) {
			yosebArr.offer(i+1);
		}
		yoseb(N,K);
		in.close();
	}

	private static void yoseb(int n, int k) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		sb.append("<");
		while(yosebArr.size()!=1) {
			for(int i=0; i<k-1; i++) {
				yosebArr.offer(yosebArr.poll());
			}
			sb.append(yosebArr.poll()+", ");
		}
		sb.append(yosebArr.poll()+">");
		out.write(sb.toString()+"\n");
		out.flush();
		out.close();
	}

}
