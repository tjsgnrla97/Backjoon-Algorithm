package step07;

import java.util.Scanner;

public class Java_1157 {
	// 5.단어 공부
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next().toUpperCase();
		
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			int num = str.charAt(i)-'A';
			count[num]++;
		}
		int max=0;
		char answer='?';
		for(int i=0; i<count.length; i++) {
			if(max<count[i]){
				max=count[i];
				answer=(char)(i+'A');
			}else if(max==count[i]) {
				answer='?';
			}
		}
		System.out.println(answer);
	}

}
