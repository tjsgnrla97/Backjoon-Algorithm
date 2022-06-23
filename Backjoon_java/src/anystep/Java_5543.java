package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_5543 {
	// 상근날드
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] bugur = new int[3];
		int[] drink = new int[2];
		for(int i=0; i<3; i++) {
			bugur[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(bugur);
		for(int i=0; i<2; i++) {
			drink[i] = Integer.parseInt(in.readLine());
		}
		Arrays.sort(drink);
		System.out.println(bugur[0]+drink[0]-50);
	}

}
