package step01;

import java.util.Scanner;

public class Java_1001 {
	public static void main(String[] args) {
		// 6.A-B
		Scanner sc = new Scanner(System.in);
		int a, b, sum;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		sum = a - b;
		System.out.print(sum);
		/*
		 * public static void main(String[] args) throws IOException { BufferedReader
		 * br= new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String str = br.readLine(); StringTokenizer st = new StringTokenizer(str,
		 * " ");
		 * 
		 * int A = Integer.parseInt(st.nextToken()); int B =
		 * Integer.parseInt(st.nextToken());
		 * 
		 * System.out.println(A - B);
		 */
	}
}
