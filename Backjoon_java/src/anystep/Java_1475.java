package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1475 {
	// 방 번호
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		String num = in.readLine();
		int size = num.length();
		int[] arr = new int[10];
		int temp = 0;
		int max = 0;
		
		for(int i=0; i<size; i++) {
			temp = num.charAt(i)-'0';
			arr[temp]++;
		}
		
		int k = (arr[6]+arr[9]);
		if(k%2==0) {
			arr[6]=k/2;
			arr[9]=k/2;
		}
		else {
			arr[6]=k/2+1;
			arr[9]=k/2+1;
		}
		for(int i : arr) {
			max = Math.max(max, i);
		}
		System.out.println(max);
	}

}
