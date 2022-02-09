package step01;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Java_10926 {
	public static void main(String[] args) throws IOException  {
		// 추가문제 1.??!
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = in.readLine();
        s +="??!";
		out.write(s);
		in.close();
		out.flush();
		out.close();
	}
}