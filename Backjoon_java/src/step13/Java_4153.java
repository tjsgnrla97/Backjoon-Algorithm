package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Java_4153 {
	// 3.직각삼각형
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		List<Long> list = new ArrayList<Long>();
		
		for(int i=0; i<3; i++) {
			list.add(Long.parseLong(stk.nextToken()));
		}
		
		Collections.sort(list);
		long A = (long) Math.pow(list.get(0), 2);
		long B = (long) Math.pow(list.get(1), 2);
		long C = (long) Math.pow(list.get(2), 2);
		
		while(A != 0) {
			if((A+B)==C) System.out.println("right");
			else System.out.println("wrong");
			
			list.clear();
			stk = new StringTokenizer(in.readLine());
			for(int i=0; i<3; i++) {
				list.add(Long.parseLong(stk.nextToken()));
			}
			Collections.sort(list);
			
			A = (long) Math.pow(list.get(0), 2);
			B = (long) Math.pow(list.get(1), 2);
			C = (long) Math.pow(list.get(2), 2);
		}
	}

}
