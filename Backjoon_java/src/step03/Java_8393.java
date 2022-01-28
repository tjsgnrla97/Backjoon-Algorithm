package step03;

import java.util.Scanner;

public class Java_8393 {

	public static void main(String[] args) {
		// 3.합
		Scanner sc = new Scanner(System.in);
		int num; int check; int sum=0;
		do{
			check = sc.nextInt();
			if(check<1 || check>10000) {
				System.out.println("입력값은 1~10000까지");
				num=sc.nextInt();
			}else num = check;
		}while(num<1 || num>10000);
		sc.close();
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}
