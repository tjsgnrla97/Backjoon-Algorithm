package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2442 {
	// 별 찍기 - 5
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		for(int y=0; y<N; y++) {
			for(int x=0; x<N-(y+1); x++) {
				System.out.print(" ");
			}
			for(int x=0; x<(y+1)*2-1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
