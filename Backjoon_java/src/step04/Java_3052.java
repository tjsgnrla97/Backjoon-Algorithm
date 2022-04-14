package step04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Java_3052 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static boolean[] arr=new boolean[42];
	static int cnt=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		//4.나머지
//		for(int i=0; i<10; i++) {
//			arr[Integer.parseInt(in.readLine())%42] = true;
//		}
//		for(int i=0; i<42; i++) {
//			if(arr[i]) cnt++;
//		}
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0; i<10; i++) h.add(Integer.parseInt(in.readLine())%42);
//		out.write(cnt+"");
		out.write(h.size()+"");
		in.close();
		out.flush();
		out.close();
	}
}
