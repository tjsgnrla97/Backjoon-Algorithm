package step02;

import java.util.Scanner;

public class Java_2753 {

	public static void main(String[] args) {
		//3.윤년
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		if((year%4==0 && year%100!=0)||year%400==0) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}

}
