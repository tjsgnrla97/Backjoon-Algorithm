package step08;

import java.util.Scanner;

public class Java_1712 {

	public static void main(String[] args) {
		//1. 손익분기점
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int ans = solve(A,B,C);
		System.out.println(ans);
	}

	private static int solve(int a, int b, int c) {
		if(c<=b) return -1;
		else return (a/(c-b)+1);
	}

}
