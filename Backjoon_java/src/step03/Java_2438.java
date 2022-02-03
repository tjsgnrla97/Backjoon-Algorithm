package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 9. 별 찍기-1
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(in.readLine());
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				out.write("*");
			}
			if(i != N) out.write("\n");
		}
		in.close();
		out.flush();
		out.close();
	}

}
