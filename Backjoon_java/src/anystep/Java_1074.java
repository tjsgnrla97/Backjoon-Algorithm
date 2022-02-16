package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_1074 {
	// Z
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N,yi,xi,cnt;
	public static void main(String[] args) throws IOException {
//		stk = new StringTokenizer(in.readLine());
//		N=Integer.parseInt(stk.nextToken());
//		yi=Integer.parseInt(stk.nextToken());
//		xi=Integer.parseInt(stk.nextToken());
//		find((int)Math.pow(2, N), yi, xi);
////		sb.append(cnt);
////		out.write(sb.toString());
//		out.write(cnt+"");
////		System.out.println(cnt);
//		in.close();
//		out.flush();
//		out.close();
		Scanner sc = new Scanner(System.in);
		int N = 1<<sc.nextInt(), R = sc.nextInt(), C = sc.nextInt();
		
		int result = 0;
		
		while ((N/=2) > 0) {
			System.out.println("현재 N : "+ N +" 현재 result : "+result+" 현재 R : "+R+"현재 C : "+C);
			result += (N*N)*(2*(R/N) + C/N);
			R %= N;
			C %= N;
		}
		
		System.out.println(result);
	}
	private static void find(int n, int y, int x) {
//		System.out.println("현재 n : "+n+" 현재 y : "+y+" 현재 x : "+x);
		if(n==1) return;
		if(y<n/2 && x<n/2) {
			find(n/2,y,x);
		}
		else if(y<n/2 && x>= n/2) {
			cnt+= n*n / 4;
			find(n/2, y, x - n/2);
		}
		else if(y >= n/2 && x<n/2) {
			cnt+= (n*n / 4) * 2;
			find(n/2, y-n/2, x);
		}else {
			cnt+= (n*n / 4) * 3;
			find(n/2, y-n/2, x-n/2);
		}
	}
}
