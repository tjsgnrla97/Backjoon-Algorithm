package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_1158_li {

	public static void main(String[] args) throws IOException{
		// 요세푸스 문제 - 리스트
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer stk = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(stk.nextToken());
		int K = Integer.parseInt(stk.nextToken());
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//숫자 세팅
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		
		sb.append("<");
		
		int idx = K-1;	//삭제할 인덱스 초기 값
		while(true) {
			//idx 요소 지우기
			int rmNum = list.remove(idx);
			//삭제된 요소 출력
			sb.append(rmNum+", ");
			//반복할 리스트 없을시 탈출
			if(list.isEmpty()) break;
			//인덱스 변경
			idx	+= (K-1);	//삭제된 요소를 고려한 인덱스 증가
			idx	%=	list.size();	//list의 범위 초과한것을 고려한 인덱스 처리
//			idx = (idx+=(K-1)) % list.size();	//축약
			
		}
		sb.setLength(sb.length()-2);
		sb.append(">");
		
		out.write(sb.toString());
	}

}
