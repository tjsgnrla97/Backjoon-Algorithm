package step06;

public class Java_4673 {

	public static void main(String[] args) {
		//2.셀프 넘버
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
