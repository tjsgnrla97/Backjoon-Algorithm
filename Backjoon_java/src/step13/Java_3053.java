package step13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Java_3053 {
	//5. 택시 기하학
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int R;
	public static void main(String[] args) throws NumberFormatException, IOException {
		DecimalFormat df = new DecimalFormat(".000000");
		R = Integer.parseInt(in.readLine());
		System.out.println(df.format(Math.PI*R*R));
		System.out.println(df.format(2.0*R*R));
	}

}
