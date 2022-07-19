package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10101 {
	// 삼각형 외우기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int A = Integer.parseInt(in.readLine());
		int B = Integer.parseInt(in.readLine());
		int C = Integer.parseInt(in.readLine());
		
		if((A+B+C)!=180) {
			out.write("Error");
		}else if(A==B && B==C) {
			out.write("Equilateral");
		}else if(A==B || B==C || C==A) {
			out.write("Isosceles");
		}else {
			out.write("Scalene");
		}
		out.flush();
		out.close();
		in.close();
	}

}
