package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11401 {
	// 이항 계수 3
	//a^p%p==a%p
	//서로소관계 a^(p-1) == 1%p
	//a^(p-2)=a^-1%p a^(p-2)%p==a^-1%p
//	n!/k!(n-k)!%p==(n*(k!(n-k)!)^-1)%p
//			==((n!%p)*(k!(n-k)!)%p)%p
//			==((n!%p)*(k!(n-k)!)^(1000000007-2)%p)%p
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static long N,K,ans;
	static final long P=1000000007;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N = Long.parseLong(stk.nextToken());
		K = Long.parseLong(stk.nextToken());
		
		long n = factorial(N);
		
		long demon = factorial(K)*factorial(N-K)%P;
		ans = (n*pow(demon,P-2)%P);
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static long pow(long n, long exp) {
		if(exp==1) return n % P;
		long temp = pow(n,exp>>1);
		
		if(exp%2==1) return(temp*temp%P)*n%P;
		return temp * temp % P;
	}
	private static long factorial(long n) {
		long num = 1;
		while(n>1) {
			num = (num*n)%P;
			n--;
		}
		return num;
	}

}
