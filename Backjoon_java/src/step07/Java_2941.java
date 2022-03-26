package step07;

import java.util.Scanner;

public class Java_2941 {
	// 9.크로아티아 알파벳
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<str.length; i++) {
			if(s.contains(str[i])) s = s.replace(str[i], "0");
		}
		System.out.println(s.length());
	}

}
