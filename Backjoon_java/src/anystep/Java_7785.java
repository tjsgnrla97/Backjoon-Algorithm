package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Java_7785 {
	// 회사에 있는 사람
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N = Integer.parseInt(in.readLine());
		Set<String> company = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			stk = new StringTokenizer(in.readLine());
			String employee = stk.nextToken();
			String log = stk.nextToken();
			if(log.equals("enter")) company.add(employee);
			else company.remove(employee);
		}
		List<String> employeeList = new ArrayList<String>(company);
		employeeList.sort(Comparator.reverseOrder());
		for(String ans : employeeList) {
			sb.append(ans).append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
