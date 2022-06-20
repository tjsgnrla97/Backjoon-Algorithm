package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_5585 {
	//거스름돈
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int pay = Integer.parseInt(in.readLine());
		int money = 1000-pay;
		int ans = 0;
		int[] coins = {500,100,50,10,5,1};
		
		for(int coin : coins) {
			if(coin > money) continue;
			ans += money / coin;
			money %=coin;
		}
		System.out.println(ans);
	}
}
