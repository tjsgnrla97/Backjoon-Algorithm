package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_10871 {

	public static void main(String[] args) throws IOException, NumberFormatException{
		// 11.X보다 작은 수
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		StringTokenizer st2 = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(st2.nextToken());
			if(a<X)	out.write(a + " ");
		}
		in.close();
		out.flush();
		out.close();
	}

}
