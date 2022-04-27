package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2512 {
	// 예산
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,M,ans;
	static int[] locate;
	public static void main(String[] args) throws NumberFormatException, IOException {
		input();
		binarySearch();
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void binarySearch() {
		int sum=0;
		for(int b : locate) sum+=b;
		if(sum<=M) ans=locate[N-1];
		else {
			int low=0;
			int high = M;
			while(low<=high) {
				int mid=(low+high)/2;
				int total=0;
				for(int i=0; i<N; i++) {
					if(locate[i]>mid) total += mid;
					else total += locate[i];
				}
				if(total>M) high = mid-1;
				else if(total<M) low = mid+1;
				else {
					ans=mid;
					return;
				}
			}
			ans=high;
			return;
		}
	}
	private static void input() throws NumberFormatException, IOException {
		N = Integer.parseInt(in.readLine());
		locate = new int[N];
		stk = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) locate[i]=Integer.parseInt(stk.nextToken());
		M = Integer.parseInt(in.readLine());
		Arrays.sort(locate);
	}

}
