package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		//7. A+B -7
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bfr.readLine());
		for(int i=0; i<T; i++) {
			String str = bfr.readLine();
			String[] sub = str.split(" ");
			int A = Integer.parseInt(sub[0]);
			int B = Integer.parseInt(sub[1]);
			int sum = A+B;
			bfw.write("Case #"+(i+1)+": "+sum+"\n");
		}
		bfr.close();
		bfw.flush();
		bfw.close();
	}

}
