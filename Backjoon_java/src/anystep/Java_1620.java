package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Java_1620 {
	// 나는야 포켓몬 마스터 이다솜
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int N  = Integer.parseInt(stk.nextToken());
		int M  = Integer.parseInt(stk.nextToken());
		
		HashMap<Integer, String> map_num = new HashMap<>();
		HashMap<String, Integer> map_str = new HashMap<>();
		for(int i=1; i<=N; i++) {
			String name = in.readLine();
			map_num.put(i, name);
			map_str.put(name, i);
		}
		for(int i=1; i<=M; i++) {
			String cmd = in.readLine();
			if(isNum(cmd)) sb.append(map_num.get(Integer.parseInt(cmd))+"\n");
			else sb.append(map_str.get(cmd)+"\n");
		}
		System.out.println(sb);
	}
	private static boolean isNum(String cmd) {
		for(int i=0; i<cmd.length(); i++) {
			if(!Character.isDigit(cmd.charAt(i))) return false;
		}
		return true;
	}

}
