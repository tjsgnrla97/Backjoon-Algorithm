package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_5354 {
	// J박스
	private static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(in.readLine());
		for(int tc=0; tc<T; tc++) {
			int N = Integer.parseInt(in.readLine());
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(j+1<N && j!=0 && i!=0 && i+1<N) out.write("J");
					else out.write("#");
				}
				out.write("\n");
			}
			out.write("\n");
		}
		out.flush();
		out.close();
		in.close();
	}

}
