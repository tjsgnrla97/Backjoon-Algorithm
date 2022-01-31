package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_2742 {

	public static void main(String[] args) throws IOException {
		//6. 기찍 N
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bfr.readLine());
		for(int i=T; i>0; i--) {
			bfw.write(i+"\n");
		}
		bfr.close();
		bfw.flush();
		bfw.close();
	}

}
