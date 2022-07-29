package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Java_10814 {
	// 나이순 정렬
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		String[][] map = new String[N][2];
		
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			map[i][0] = stk.nextToken();
			map[i][1] = stk.nextToken();
		}
		
		Arrays.sort(map, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
			
		});
		
		for(int i=0; i<N; i++) {
			sb.append(map[i][0]).append(" ").append(map[i][1]).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
