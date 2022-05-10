package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11650 {
	// 6.좌표 정렬하기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int pos[][];
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
		Arrays.sort(pos, (pos_1, pos_2)->{
			if(pos_1[0] == pos_2[0]) return pos_1[1]-pos_2[1];
			else return pos_1[0]-pos_2[0];
		});
		for(int i=0; i<N; i++) sb.append(pos[i][0]+" "+pos[i][1]).append("\n");
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		pos = new int[N][2];
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			pos[i][0] = Integer.parseInt(stk.nextToken());
			pos[i][1] = Integer.parseInt(stk.nextToken());
		}
	}

}
