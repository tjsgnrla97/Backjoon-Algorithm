package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_3009 {
	//2.네 번째 점
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int[] point_one = {Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())};
		stk = new StringTokenizer(in.readLine());
		int[] point_two = {Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())};
		stk = new StringTokenizer(in.readLine());
		int[] point_three = {Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())};
		
		int x, y;
		
		if(point_one[0]==point_two[0]) x=point_three[0];
		else if(point_one[0]==point_three[0]) x=point_two[0];
		else x=point_one[0];
		
		if(point_one[1]==point_two[1]) y=point_three[1];
		else if(point_one[1]==point_three[1]) y=point_two[1];
		else y=point_one[1];
		
		System.out.println(x+" "+y);
	}

}
