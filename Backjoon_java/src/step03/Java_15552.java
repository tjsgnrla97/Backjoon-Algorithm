package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 4. 빠른 A+B
		//BufferedReder, StringBuilder 큰틀해결
		//String.indexOf(" "); String.substring(); 효율증가
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bfr.readLine());
		
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(bfr.readLine(), " ");
			bfw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}
		bfr.close();
		bfw.flush();
		bfw.close();
	}

}
