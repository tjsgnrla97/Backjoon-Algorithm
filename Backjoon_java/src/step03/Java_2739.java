package step03;

import java.util.Scanner;

public class Java_2739 {

	public static void main(String[] args) {
		// 1.구구단
		Scanner sc = new Scanner(System.in);
		int num; int check;
		do{
			check = sc.nextInt();
			if(check<1 || check>9) {
				System.out.println("입력값은 1~9까지");
				num=sc.nextInt();
			}else num = check;
		}while(num<1 || num>9);
		sc.close();
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
