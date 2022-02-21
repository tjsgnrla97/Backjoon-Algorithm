package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_1260 {
	// DFS와 BFS
	//인접리스트 (어레이리스트로 작성)
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int N, M, V;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		N=Integer.parseInt(stk.nextToken());
		M=Integer.parseInt(stk.nextToken());
		V=Integer.parseInt(stk.nextToken());
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
		boolean[] isVisited = new boolean[N+1];
		for(int i=0; i<=N; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		for(int i=0; i<M; i++) {
			stk = new StringTokenizer(in.readLine());
			int from = Integer.parseInt(stk.nextToken());
			int to = Integer.parseInt(stk.nextToken());
			adjList.get(from).add(to);
			adjList.get(to).add(from);
		}
		for(int i=1; i<=N; i++) {
			Collections.sort(adjList.get(i));
		}
		dfs(adjList, isVisited, V);
		Arrays.fill(isVisited, false);
		System.out.println();
		bfs(adjList,isVisited,V);
	}
	private static void bfs(ArrayList<ArrayList<Integer>> adjList, boolean[] isVisited, int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		isVisited[start]=true;
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.print(start+" ");
			for(int i=0; i<adjList.get(start).size();i++) {
				if(!isVisited[adjList.get(start).get(i)]) {
					queue.add(adjList.get(start).get(i));
					isVisited[adjList.get(start).get(i)]=true;
				}
			}
		}
	}
	private static void dfs(ArrayList<ArrayList<Integer>> adjList, boolean[] isVisited, int start) {
		if(isVisited[start]==true) return;
		isVisited[start]=true;
		System.out.print(start+" ");
		for(int i=0; i<adjList.get(start).size();i++) {
			if(!isVisited[adjList.get(start).get(i)]) {
				dfs(adjList, isVisited ,adjList.get(start).get(i));
			}
		}
	}
	
}
