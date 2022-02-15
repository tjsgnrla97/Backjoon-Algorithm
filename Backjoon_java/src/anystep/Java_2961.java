package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2961 {
	// 도영이가 만든 맛있는 음식
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int N;
	static int[][] food;
	static boolean isSelected[];
	static long ansScore;
	static long sRes, bRes;
	public static void main(String[] args) throws NumberFormatException, IOException {
		N=Integer.parseInt(in.readLine());
		food = new int[N][2];
		isSelected = new boolean[N];
		sRes=1; bRes=0;
		for(int i=0; i<N; i++) {
			stk=new StringTokenizer(in.readLine());
			food[i][0]=Integer.parseInt(stk.nextToken());
			food[i][1]=Integer.parseInt(stk.nextToken());
		}
		ansScore=Long.MAX_VALUE;
		Subset(0);
		out.append(ansScore + "");
		in.close();
		out.flush();
		out.close();
	}
	private static void Subset(int cnt) {
		boolean isFirstSelected = false;
		if(cnt==food.length) {
			sRes=1;
			bRes=0;
			for(int j=0; j<food.length; j++) {
				if(isSelected[j]) {
					sRes *= food[j][0];
					bRes += food[j][1];
					isFirstSelected = true;
//					System.out.println(Math.abs(sRes-bRes));
				}
			}
			if(!isFirstSelected) return;
			ansScore = Math.min(ansScore, Math.abs(sRes-bRes));
			return;
		}
		isSelected[cnt]=true;
		Subset(cnt+1);
		isSelected[cnt]=false;
		Subset(cnt+1);
	}

}
