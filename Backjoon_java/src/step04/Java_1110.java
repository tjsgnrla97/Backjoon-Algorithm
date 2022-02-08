package step04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Java_1110 {
 
	public static void main(String[] args) throws IOException {
		//3.더하기 사이클
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			//(N % 10) * 10) N의 일의 자리수 ((N / 10) + (N % 10)) % 10 자리수 합
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
	}
}
