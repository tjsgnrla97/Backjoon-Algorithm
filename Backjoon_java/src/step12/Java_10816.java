package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_10816 {
	// 4. 숫자 카드 2
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N, M, num;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		arr = new int[N];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(stk.nextToken());
		
		Arrays.sort(arr);
		
		M = Integer.parseInt(in.readLine());
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<M; i++) {
			num = Integer.parseInt(stk.nextToken());
			sb.append((upperIndex()-lowerIndex())+" ");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static int lowerIndex() {
		int start = 0, end = N-1, mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]>=num) end = mid-1;
			else start = mid+1;
		}
		return start;
	}
	private static int upperIndex() {
		int start = 0, end = N-1, mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]>num) end = mid-1;
			else start = mid+1;
		}
		return start;
	}

}
