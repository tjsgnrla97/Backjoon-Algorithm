package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1924 {
	// 2007년
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		
		int month = Integer.parseInt(stk.nextToken());
		int day = Integer.parseInt(stk.nextToken());
		
		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int n=0;
		for(int i=0; i<month; i++) {
			n+=months[i];
		}
		n += day-1;
		System.out.println(days[n%7]);
	}

}
