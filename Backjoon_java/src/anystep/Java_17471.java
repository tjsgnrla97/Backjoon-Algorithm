package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_17471 {
	// 게리맨더링
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int V,E,ans;
	static ArrayList<Integer>[] union;
	static int[] population;
	static boolean[] isVisitedA;
	public static void main(String[] args) throws NumberFormatException, IOException {
		V = Integer.parseInt(in.readLine());
		union = new ArrayList[V+1];
		population = new int[V+1];
		stk = new StringTokenizer(in.readLine());
		for(int i=1; i<=V; i++) {
			population[i]=Integer.parseInt(stk.nextToken());
			union[i]=new ArrayList<>();
		}
		for(int from=1; from<=V; from++) {
			stk = new StringTokenizer(in.readLine());
			E = Integer.parseInt(stk.nextToken());
			for(int j=1; j<=E; j++) {
				int to = Integer.parseInt(stk.nextToken());
				union[from].add(to);
			}
		}
		isVisitedA = new boolean[V+1];
		ans=Integer.MAX_VALUE;
		selectA(1);
		if(ans==Integer.MAX_VALUE) out.write(-1+"");
		else out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}
	private static void selectA(int idx) {
		if(idx==V+1) {
			if(unionCheck()) {
				int sumA=0, sumB=0;
				for(int from=1; from<=V; from++) {
					if(isVisitedA[from]) sumA+=population[from];
					else sumB+=population[from];
				}
				ans = Math.min(ans, Math.abs(sumA-sumB));
			}
			return;
		}
		isVisitedA[idx]=true;
		selectA(idx+1);
		isVisitedA[idx]=false;
		selectA(idx+1);
	}
	private static boolean unionCheck() {
		boolean[] isLinked = new boolean[V+1];
		int unionA = -1;
		for(int from=1; from<=V; from++) {
			if(isVisitedA[from]) {
				unionA=from;
				break;
			}
		}
		int unionB = -1;
		for(int from=1; from<=V; from++) {
			if(!isVisitedA[from]) {
				unionB=from;
				break;
			}
		}
		if(unionA==-1 || unionB==-1) return false;
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(unionA);
		isLinked[unionA]=true;
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int i=0; i<union[current].size(); i++) {
				if(isLinked[union[current].get(i)]) continue;
				if(!isVisitedA[union[current].get(i)]) continue;
				isLinked[union[current].get(i)]=true;
				q.add(union[current].get(i));
			}
		}
		
		q.add(unionB);
		isLinked[unionB]=true;
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int i=0; i<union[current].size(); i++) {
				if(isLinked[union[current].get(i)]) continue;
				if(isVisitedA[union[current].get(i)]) continue;
				isLinked[union[current].get(i)]=true;
				q.add(union[current].get(i));
			}
		}
		
		for(int from=1; from<=V; from++) {
			if(!isLinked[from]) return false;
		}
		
		return true;
	}
}
