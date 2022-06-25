package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1920 {
	// 수 찾기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		int[] arr = new int[N];
		
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) arr[i] = Integer.parseInt(stk.nextToken());
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(in.readLine());
		int[] arr2 = new int[M];
		
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<M; i++) arr2[i] = Integer.parseInt(stk.nextToken());
		
		for(int i=0; i<M; i++) {
			System.out.println(binarySearch(arr, arr2[i]));
		}
	}
	private static int binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length-1;
		int mid=0;
		while(low<=high) {
			mid = (low+high)/2;
			if(arr[mid]==num) return 1;
			
			else if(arr[mid]>num) high = mid-1;
			else if(arr[mid]<num) low = mid+1;
		}
		return 0;
	}

}
