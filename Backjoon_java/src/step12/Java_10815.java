package step12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_10815 {
	// 1.숫자 카드
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M;
	static int[] cards;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		cards = new int[N];
		
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) cards[i] = Integer.parseInt(stk.nextToken());
		
		Arrays.sort(cards);
		M = Integer.parseInt(in.readLine());
		
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<M; i++) {
			int temp = Integer.parseInt(stk.nextToken());
			sb.append(binarySearch(temp)+" ");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static int binarySearch(int temp) {
		int first = 0;
		int last = N-1;
		int mid = 0;
		while(first<=last) {
			mid = (first+last)/2;
			if(cards[mid]==temp) return 1;
			if(cards[mid] < temp) first = mid+1;
			else last = mid-1;
		}
		return 0;
	}

}
