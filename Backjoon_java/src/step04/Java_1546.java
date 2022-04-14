package step04;

import java.util.Arrays;
import java.util.Scanner;

public class Java_1546 {

	public static void main(String[] args) {
		//5.평균
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		double ans=0;
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		ans = calc(arr);
		System.out.println(ans);
	}
	private static double calc(int[] arr) {
		double temp=0;
		double ans=0;
		double[] newArr = new double[arr.length];
		for(int i=0; i<arr.length; i++) {
			temp = (arr[i]/(double)arr[arr.length-1])*100;
			newArr[i]=temp;
		}
//		for(double a : newArr) System.out.println(a);
		for(int i=0; i<newArr.length; i++) {
			ans += newArr[i];
		}
//		System.out.println(ans);
		ans /= (double)newArr.length;
		return ans;
	}

}
