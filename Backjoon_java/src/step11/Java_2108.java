package step11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Java_2108 {
	// 4. 통계학
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N,max,min,Average, Median, Mode, Range;
	static double sum;
	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		N = Integer.parseInt(in.readLine());
		for(int i=0; i<N; i++) {
			int temp = Integer.parseInt(in.readLine());
			sum += (double) temp;
			list.add(temp);
		}
		//중앙값을 찾기 위해 미리 정렬
		Collections.sort(list);
		
		max = Collections.max(list);
		min = Collections.min(list);
		
		//둘다 음수일 경우
		if(max <0 && min <0) min = Math.abs(min);
		//둘다 양수일 경우
		else if(max >0 && min>0) min = min*-1;
		//min, max 서로 부호가 다를 때, 둘 중에 하나라도 0일 떄
		else {
			max = Math.abs(max);
			min = Math.abs(min);
		}
		Average = (int) Math.round(sum/N);
		Median = list.get(N/2);
		Range = max+min;
		
		for(int num : list) hashMap.put(num, hashMap.getOrDefault(num, 0)+1);
		
		int numbers = 0;
		for(int key : hashMap.values()) {
			numbers = Math.max(numbers, key);
		}
		
		//위에서 사용했던 list를 다시 사용하기 위해 clear 처리
		//최빈수를 구하기 최빈수와 같은 빈도의 수를 list에 삽입
		list.clear();
		for(int key : hashMap.keySet()) {
			if(hashMap.get(key)==numbers) list.add(key);
		}
		//최빈수가 2개 이상일 경우 2번째로 작은 값을 뽑아내야 하기 때문에 list를 정렬
		Collections.sort(list);
		
		//최빈수와 빈도수가 같은 수가 2개 이상일 경우 index 1의 값을 최빈수로 설정
		//1개일 경우 그대로 index 0 을 최빈수로 설정
		if(list.size()>=2) Mode = list.get(1);
		else Mode = list.get(0);
		
		sb.append(Average).append("\n").append(Median).append("\n").append(Mode).append("\n").append(Range);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
