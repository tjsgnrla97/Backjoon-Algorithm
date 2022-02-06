package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10951 {

	public static void main(String[] args) throws IOException {
		// 2. A+B-4
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stk;
		String input;
		while ((input= in.readLine()) != null) {
			stk = new StringTokenizer(input);
			while(stk.hasMoreElements()) {
				int A = Integer.parseInt(stk.nextToken());
				int B = Integer.parseInt(stk.nextToken());
				int sum = A + B;
				sb.append(sum).append("\n");
			}
		}
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}

}
