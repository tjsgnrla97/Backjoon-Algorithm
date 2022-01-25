package step01;

import java.util.Scanner;

public class Java_1008 {
	public static void main(String[] args) {
		// 8.A/B
		Scanner sc = new Scanner(System.in);
		int a, b; double sum;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		sum = (double)a / b;
		System.out.print(sum);
	}
}
