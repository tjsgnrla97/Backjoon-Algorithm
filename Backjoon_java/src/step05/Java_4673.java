package step05;

public class Java_4673 {

	public static void main(String[] args) {
		//2.셀프 넘버
//		1. 1~10000이하의 정수 10000+1
//		2. 1 ~ 10000 d(i) for문
//		3. n = d(i) n<10001일때 배열값 true
//		4. 배열[n] true이면 생성자가 존재.
//		5. 반복문을 돌면서 생성자 없는값 출력
		boolean[] input = new boolean[10001];
		
		for(int num=1; num<10001; num++) {
			int n = d(num);
			
			if(n < 10001) input[n]=true;
		}
		for(int num=1; num<10001; num++) {
			if(input[num]==false) System.out.println(num);
		}
	}

	private static int d(int number) {
		int sum = number;
		while(number != 0) {
			sum += number%10;
			number /= 10;
		}
		return sum;
	}

}
