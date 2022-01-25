package step01;

import java.util.Scanner;

public class Java_10869 {

	public static void main(String[] args) {
		// 9. 사칙연산
		Scanner sc = new Scanner(System.in);
		int a, b, addSum, minSum, plsSum, divSum, perSum; 
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		addSum = a + b;
		minSum = a - b;
		plsSum = a * b;
		divSum = a / b;
		perSum = a % b;
		System.out.println(addSum);
		System.out.println(minSum);
		System.out.println(plsSum);
		System.out.println(divSum);
		System.out.print(perSum);
	}
}
