import java.util.*;
public class java2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int mul1 = A*((B%100)%10);
		int mul2 = A*((B%100)-((B%100)%10));
		int mul3 = A*(B-(B%100));
		int sum = mul1+mul2+mul3;
		System.out.println(mul1);
		System.out.println(mul2/10);
		System.out.println(mul3/100);
		System.out.println(sum);
	}
}
