package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_16953 {
	// A->B
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static long A,B;
	static int ans;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		A = Long.parseLong(stk.nextToken());
		B = Long.parseLong(stk.nextToken());
		
		out.write(bfs()+"");
		out.flush();
		out.close();
		in.close();
	}
	private static int bfs() {
		Queue<Long> q = new LinkedList<Long>();
		q.add(A);
		
		while(!q.isEmpty()) {
			int size = q.size();
			
			for(int i=0; i<size; i++) {
				long current = q.poll();
				if(current==B) return ans+1;
				if(current*2<=B) q.add(current*2);
				if(current*10+1<=B) q.add(current*10+1);
			}
			ans++;
		}
		return -1;
	}

}
