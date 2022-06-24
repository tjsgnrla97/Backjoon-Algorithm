package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2752 {
	// 세수정렬
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[3];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<3; i++) arr[i] = Integer.parseInt(stk.nextToken());
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
	}

}
