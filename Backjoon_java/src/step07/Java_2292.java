package step07;

import java.io.IOException;
import java.util.Scanner;

public class Java_2292 {

	public static void main(String[] args) throws IOException {
		//2.
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		solve(A);
	}

	private static void solve(int a) {
		int i=1;
		int n = a-1;
		while(n>i*6) {
			n-=i*6;
			i++;
		}
		System.out.println(a != 1 ? i+1 : 1);
	}

}
