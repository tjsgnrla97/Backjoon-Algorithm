package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1085 {
	// 1. 직사각형에서 탈출
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		int x = Integer.parseInt(stk.nextToken());
		int y = Integer.parseInt(stk.nextToken());
		int w = Integer.parseInt(stk.nextToken());
		int h = Integer.parseInt(stk.nextToken());
		int dis_x = w-x;
		int dis_y = h-y;
		int x_min = 0;
		int y_min = 0;
		x_min = dis_x > x? x: dis_x;
		y_min = dis_y > y? y: dis_y;
		System.out.println(x_min>y_min?y_min : x_min);
	}

}
