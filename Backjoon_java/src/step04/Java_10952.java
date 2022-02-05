package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10952 {

	public static void main(String[] args) throws IOException {
		// 1.A+B-5
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String input = in.readLine();
			StringTokenizer stk = new StringTokenizer(input);
			int A = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			if(A==0&& B==0) break;
			int sum = A+B;
			sb.append(sum).append("\n");
		}
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}

}
