package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Java_2605 {
	// 줄 세우기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N;
	static ArrayList<Integer> StudentList = new ArrayList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		N=Integer.parseInt(in.readLine());
		stk = new StringTokenizer(in.readLine());
		StudentList.add(-1);
		for(int n=1; n<=N; n++) {
			int num = Integer.parseInt(stk.nextToken());
			StudentList.add(n-num,n);
		}
		for(int i=1; i<=N; i++) sb.append(StudentList.get(i)+" ");
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}
}
