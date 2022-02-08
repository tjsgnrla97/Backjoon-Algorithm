package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_2493 {
	static int N, result[];
	static class Lazor{
		int num, height;
		public Lazor(int num, int height) {
			this.num = num;
			this.height = height;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 탑
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(in.readLine());
		result = new int[N];
		Stack<Lazor> lazors = new Stack<>();
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) {
			int curr_H = Integer.parseInt(st.nextToken());
			//수신 받을 탑이 있으면
			while(!lazors.isEmpty()) {
				//현재 탑이 더 높을때
				if(curr_H > lazors.peek().height) {
					lazors.pop();
				}
				//현재 탑이 더 낮을때 앞의 탑 번호 저장
				else {
					result[i] = lazors.peek().num+1;
					break;
				}
			}
			//수신 받을 탑이 없을때
			if(lazors.isEmpty()) {
				result[i]=0;
			}
			lazors.push(new Lazor(i, curr_H));
		}
	
		for(int i=0; i<N; i++) {
			sb.append(result[i] + " ");
		}
		out.write(sb.toString());
		in.close();
		out.flush();
		out.close();
	}
}
