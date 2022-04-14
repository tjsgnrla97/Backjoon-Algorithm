package step06;

import java.util.Scanner;

public class Java_2675 {
	//4. 문자열 반복
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int repeat = in.nextInt();
			String str = in.next();
			for(int i=0; i<str.length(); i++) {
				for(int j=0; j<repeat; j++) {
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}

}
