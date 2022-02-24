package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java_1753 {
	// 최단경로
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int V,E,K;
	static int u,v,w; //from, to, weight
	static int[] distance;
	static ArrayList<Edge>[] adjList;
	
	static class Edge implements Comparable<Edge>{
		int idx, weight;

		public Edge(int idx, int weight) {
			super();
			this.idx = idx;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			// TODO Auto-generated method stub
			return this.weight-o.weight;
		}
		
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		V = Integer.parseInt(stk.nextToken());
		E = Integer.parseInt(stk.nextToken());
		K = Integer.parseInt(in.readLine());
		
		//step01. 거리배열 무한대로 초기화
		distance = new int[V+1]; //인덱스 1부터 사용할 예정
		for(int i=1; i<=V; i++) {
			distance[i]=Integer.MAX_VALUE;
		}
		//step02.인접리스트 초기화
		adjList = new ArrayList[V+1];
		for(int i=1; i<=V; i++) {
			adjList[i]=new ArrayList<Edge>();
		}
		//step03. 방향간선 인접리스트 입력
		for(int i=1; i<=E; i++) {
			stk = new StringTokenizer(in.readLine());
			
			u=Integer.parseInt(stk.nextToken());
			v=Integer.parseInt(stk.nextToken());
			w=Integer.parseInt(stk.nextToken());
			
			adjList[u].add(new Edge(v, w));
		}
		//step04. 다익스트라 출발지 start부터 진행 K가 start정점
		dijkstra(K);
		//step05. 전체 출력
		for(int i=1; i<=V; i++) {
			if(distance[i]==Integer.MAX_VALUE) sb.append("INF\n");
			else sb.append(distance[i]+"\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static void dijkstra(int start) {
		//1.출발지 비용 0으로 초기화 출발지를 우선순위 큐에 넣고 시작
		PriorityQueue<Edge> q = new PriorityQueue<Edge>();
		distance[start]=0;
		q.add(new Edge(start, 0));
		
		while(!q.isEmpty()) {
			Edge current = q.poll();
			
			//2.더 큰 가중치로 도착한 경우 패스
			if(current.weight > distance[current.idx]) continue;
			
			//3.현재 위치에 연결된 간선 탐색
			int length = adjList[current.idx].size();
			for(int i=0; i<length; i++) {
				Edge next = (Edge) adjList[current.idx].get(i);
				
				//4.weight 가중치가 더 작을때만 갱신하고 우선순위 큐에 넣기
				if(distance[next.idx]>current.weight+next.weight) {
					distance[next.idx] = current.weight+next.weight;
					q.add(new Edge(next.idx, distance[next.idx]));
				}
			}
		}
	}
}
