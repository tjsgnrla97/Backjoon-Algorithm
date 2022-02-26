package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_2480_add {

	public static void main(String[] args) throws IOException {
		// 추가2. 주사위 세개
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(in.readLine());
		int[] num = new int[3];
		for (int i = 0; i < 3; i++)
			num[i] = Integer.parseInt(stk.nextToken());
		if (num[0] == num[1] && num[1] == num[2] && num[2] == num[0])
			System.out.print(10000 + num[0] * 1000);
		else if (num[0] == num[1])
			System.out.print(1000 + num[0] * 100);
		else if (num[1] == num[2])
			System.out.print(1000 + num[1] * 100);
		else if (num[2] == num[0])
			System.out.print(1000 + num[2] * 100);
		else
			System.out.print(Math.max(Math.max(num[0], num[1]), num[2]) * 100);
	}

}
