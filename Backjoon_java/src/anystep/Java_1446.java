package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_1446 {
    //지름길
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, D;
    static int[] distance;
    static class Node {
        int endPoint;
        int score;

        public Node(int endPoint, int score) {
            this.endPoint = endPoint;
            this.score = score;
        }
    }
    static List<Node>[] graph;
    public static void main(String[] args) throws IOException {
        distance = new int[10001];
        graph = new List[10001];
        for (int i=0; i<graph.length; i++) {
            distance[i] = i;
            graph[i] = new ArrayList<>();
        }
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        D = Integer.parseInt(stk.nextToken());
        for(int n=0; n<N; n++){
            stk = new StringTokenizer(in.readLine());
            int start = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());
            int d = Integer.parseInt(stk.nextToken());
            graph[start].add(new Node(end, d));
        }
        dijkstra(0);
        System.out.println(distance[D]);
    }

    private static void dijkstra(int start) {
        if(start> D) return;
        if(distance[start+1] > distance[start]+1) {
            distance[start+1] = distance[start]+1;
        }
        for(int from=0; from<graph[start].size(); from++){
            if(distance[start]+graph[start].get(from).score < distance[graph[start].get(from).endPoint]) {
                distance[graph[start].get(from).endPoint] = distance[start]+graph[start].get(from).score;
            }
        }
        dijkstra(start+1);
    }
}
