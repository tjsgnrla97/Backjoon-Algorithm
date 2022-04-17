package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_9935 {
	// 문자열 폭발
	// 문자열의 재입력과 삭제과정이 한번의 문자열탐색과정에서 동시에 일어나야 한다.(메모리 초과때문)
	//메모리 22736KB 시간 320ms
	//풀이시간 56분 42초
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
//	static String ans, boom, res;
	public static void main(String[] args) throws IOException {
		String str = in.readLine();
		String boom = in.readLine();
		String ans = solution(str, boom);
		out.write((ans.length()==0)?"FRULA":ans);
		out.flush();
		out.close();
		in.close();		
//		String ans, boom, res;
//		ans = in.readLine();
//		boom = in.readLine();
//		while(ans.length()!=0) {
//			String[] str = ans.split(boom);
//			res="";
////			System.out.println(Arrays.toString(str));
//			if(str.length==1 && str[0].length()==0) break;
//			if(str.length==1 && str[0].length()==ans.length()) break;
//			for(int i=0; i<str.length; i++) {
//				res += str[i];
//			}
//			ans = res;
//		}
//		ans = ans.length()==0?"FRULA":ans;
//		out.write(ans+"");
//		out.flush();
//		out.close();
//		in.close();
	}
private static String solution(String str, String boom) {
	char[] res = new char[str.length()];
	int idx=0;
	for(int i=0; i<str.length(); i++) {
		res[idx]=str.charAt(i);
		if(isBoom(res,idx,boom)) idx -= boom.length();
		idx++;
	}
	return String.valueOf(res, 0, idx);
}
private static boolean isBoom(char[] res, int idx, String boom) {
	if(idx<boom.length()-1) return false;
	for(int i=0; i<boom.length(); i++) {
		if(boom.charAt(i)!=res[i+idx-(boom.length()-1)]) return false;
	}
	return true;
}

}
