package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Java_1181 {
	// 8.단어 정렬
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) arr[i] = in.readLine();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) return o1.compareTo(o2);
				else return o1.length() - o2.length();
			}
		});
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[0]);
		sb.append(arr[0]).append("\n");
		for(int i=1; i<N; i++) {
			if(!arr[i].equals(arr[i-1])) sb.append(arr[i]).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
}
