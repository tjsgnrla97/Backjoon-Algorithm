package step02;

import java.util.Scanner;

public class Java_2884 {

	public static void main(String[] args) {
		//5.알람 시계
		Scanner sc = new Scanner(System.in);
		int h,m;
		h=sc.nextInt();
		if(h>=0 && h<=23) h=h;
		else {
			System.out.println("범위 오류 : 0 <=h <=23"+h);
			h=sc.nextInt();
		}
		m=sc.nextInt();
		if(m>=0 && m<=59) m=m;
		else {
			System.out.println("범위 오류 : 0 <=h <=59"+m);
			m=sc.nextInt();
		}
		sc.close();
		m -= 45;
		if(m<0) {
			m=60+m;
			h-=1;
			if(h<0) {
				h=24+h;
			}
		}
		System.out.println(h+" "+m);
	}
}
