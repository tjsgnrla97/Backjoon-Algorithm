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

public class Java_18352 {
	//특정 거리의 도시 찾기
//	최단거리 탐색? -> 다익스트라? bfs?
//	모든 도로의 거리가 1 = bfs사용가능
//	최단 거리가 K인 모든 도시들의 번호가 필요하다.
//	입력받은 도시의 연결 정보를 이중리스트로 연결된 그래프에 담는다.
//	모든 도시의 거리를 -1로 초기화.
//	출발 도시 거리는 0으로 초기화.
//	큐에 시작도시를 넣고 bfs 실행.
//	큐가 빌때까지 해당 도시에 연결된 도시에 방문한 적이 없으면 해당 도시에 현재 도시의 거리에서 +1
//	다시 큐에 넣는다.
//	거리배열에서 k값과 같은 도시를 오름차순으로 출력.
//	만약에 존재하지 않으면 -1출력.
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int V,E,K,start;
	static ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
	static int[] distance = new int[300001]; //K가 1<=K<=300000 1부터 시작이니까 +1
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		V=Integer.parseInt(stk.nextToken());
		E=Integer.parseInt(stk.nextToken());
		K=Integer.parseInt(stk.nextToken());
		start=Integer.parseInt(stk.nextToken());
		//연결리스트에 정점 추가
		for(int i=0; i<=V; i++) {
			map.add(new ArrayList<Integer>());
			distance[i]=-1; //최단거리 -1로 초기화
		}
		//간선 정보 from to 입력
		for(int i=0; i<E; i++) {
			stk=new StringTokenizer(in.readLine());
			int from = Integer.parseInt(stk.nextToken());
			int to = Integer.parseInt(stk.nextToken());
			map.get(from).add(to);
		}
		//시작지점의 최단거리 값 0으로 초기화
		distance[start]=0;
		bfs();
		boolean check = false;
		for(int i=1; i<=V; i++) {
			if(distance[i]==K) {
				System.out.println(i);
				check=true;
			}
		}
		if(!check) {
			System.out.println(-1);
		}
	}
	private static void bfs() {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		while(!q.isEmpty()) {
			int current = q.poll();
			for(int i=0; i<map.get(current).size(); i++) {
				//시작은 start 정점 from정점(이전정점)에서의 연결된 to정점(다음정점) 번호
				int next = map.get(current).get(i);
//				System.out.println("현재정점 : "+current+" to정점 : "+next);
				if(distance[next]==-1) { //최단거리 미설정이라면
					//도로의 거리(가중치)가 1이기 때문에 이전 최단거리에 +1한 값이 next의 최단거리
					distance[next]=distance[current]+1;
					q.offer(next);
				}
			}
		}
	}

}
