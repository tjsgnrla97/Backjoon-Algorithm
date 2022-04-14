package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2562 {
	// 2.최댓값
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[9];
		int max=-1;
		int max_idx=-1;
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		for(int i=0; i<9; i++) {
			if(arr[i]>max) max_idx=i+1;
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
		System.out.println(max_idx);
	}

}
