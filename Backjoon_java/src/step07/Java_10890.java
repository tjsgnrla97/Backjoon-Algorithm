package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_10890 {
	//3.알파벳 찾기
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];
		for(int i=0; i<alpha.length; i++) alpha[i]=-1;
		String str = in.readLine();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(alpha[ch-'a']==-1) alpha[ch-'a']=i;
		}
		for(int b : alpha) System.out.print(b+" ");
	}

}
