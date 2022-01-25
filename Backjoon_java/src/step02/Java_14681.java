package step02;

import java.util.Scanner;

public class Java_14681 {

	public static void main(String[] args) {
		//4.사분면
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		if(x>=-1000 && x<=1000 && x!=0) x=x;
		else {
			System.out.println("범위 오류 : -1000 <=x <=1000 x!=0"+x);
			x=sc.nextInt();
		}
		y=sc.nextInt();
		if(y>=-1000 && y<=1000 && y!=0) y=y;
		else {
			System.out.println("범위 오류 : -1000 <=y <=1000 x!=0"+y);
			x=sc.nextInt();
		}
		sc.close();
		if(x>0 && y>0) {
			System.out.print(1);
		}else if(x<0 && y>0) {
			System.out.print(2);
		}else if(x<0 && y<0) {
			System.out.print(3);
		}else {
			System.out.print(4);
		}
	}

}
