package step01;

import java.util.Scanner;

public class Java_18108_add {

	public static void main(String[] args) {
		// 추가1. 1998년생인 내가 태국에서는 2541년생?!
		Scanner in = new Scanner(System.in);
		int bool = in.nextInt();
		int year = bool-543;
		System.out.println(year);
		in.close();
	}

}
