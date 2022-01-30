package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_2741 {

	public static void main(String[] args) throws IOException {
		// 5.N 찍기
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bfr.readLine());
		for(int i=1; i<=T; i++) {
			bfw.write(i+"\n");
		}
		bfr.close();
		bfw.flush();
		bfw.close();
	}

}
