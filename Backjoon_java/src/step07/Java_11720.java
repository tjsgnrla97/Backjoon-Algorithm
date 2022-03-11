package step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_11720 {

	public static void main(String[] args) throws IOException {
		// 2. 숫자의 합
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		int sum=0;
		for(byte a : in.readLine().getBytes()) sum+=(a-'0');
		System.out.println(sum);
	}

}
