package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10886 {
	//0 = not cute / 1 = cute
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		int cnt = 0;
		
		for(int i=0; i<N; i++) {
			int M = Integer.parseInt(in.readLine());
			
			if(M==1) cnt++;
			else cnt--;
		}
		String ans = (cnt>0)?"Junhee is cute!" : "Junhee is not cute!";
		out.write(ans);
		out.flush();
		out.close();
		in.close();
	}

}
