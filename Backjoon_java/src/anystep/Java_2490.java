package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2490 {
	// 윷놀이
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		for(int tc=1; tc<=3; tc++) {
			stk = new StringTokenizer(in.readLine());
			int cnt=0;
			int[] arr = new int[4];
			for(int i=0; i<4; i++) arr[i] = Integer.parseInt(stk.nextToken());
			for(int a : arr) if(a==0) cnt+=1;
			switch (cnt) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;
			}
		}

	}

}
