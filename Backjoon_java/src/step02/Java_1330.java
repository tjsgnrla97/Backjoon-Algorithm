package step02;

import java.util.Scanner;

public class Java_1330 {

	public static void main(String[] args) {
		//1.두 수 비교하기
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		if(a>b) {
			System.out.print(">");
		}else if(a < b) {
			System.out.print("<");
		}else {
			System.out.print("==");
		}
	}

}
