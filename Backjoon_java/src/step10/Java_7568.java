package step10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_7568 {
	// 3.덩치
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N;
	static int[][] man;
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
		solve();
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void solve() {
		for(int i=0; i<N; i++) {
			int level=1;
			for(int j=0; j<N; j++) {
				if(i==j) continue;
				else if(man[i][0]< man[j][0] && man[i][1] < man[j][1]) level++;
			}
			sb.append(level).append(" ");
		}
	}
	private static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		man = new int[N][2];
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			man[i][0] = Integer.parseInt(stk.nextToken());
			man[i][1] = Integer.parseInt(stk.nextToken());
		}
	}

}
