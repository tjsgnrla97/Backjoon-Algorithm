package step03;

import java.util.Scanner;

public class Java_10950 {

	public static void main(String[] args) {
		// 2.A+B-3
		Scanner sc = new Scanner(System.in);
		int T, a,b;
		int check1, check2;
		T=sc.nextInt();
		for(int i=1; i<=T; i++) {
			do {
				check1 = sc.nextInt();
				check2 = sc.nextInt();
				if (check1 < 0 || check1 > 10 || check2 < 0 || check2 > 10) {
					System.out.println("입력값은 1~9까지");
					a = sc.nextInt();
					b = sc.nextInt();
				} else
					a = check1;
					b = check2;
			} while (a < 0 || a > 10 || b < 0 || b > 10);
			System.out.println(a+b);
		}
		sc.close();
	}

}
