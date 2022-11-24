package anystep;

import java.io.*;
import java.util.*;

public class Java_1325 {
    //효율적인 해킹
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static List<Integer>[] graph;

    static int[] isVisited;
    static int[] ans;
    static int max;
    public static void main(String[] args) throws IOException {
        input();
        for (int i=1; i<=N; i++){
            isVisited = new int[N+1];
            BFS(i);
        }
        for (int i=1; i<=N; i++){
            max = Math.max(max,ans[i]);
        }
        for (int i=1; i<=N; i++){
            if(max==ans[i]) sb.append(i+" ");
        }
        System.out.println(sb.toString());
    }

    private static void BFS(int node) {
        Queue<Integer> q = new LinkedList<>();

        q.add(node);
        isVisited[node] = 1;
        while (!q.isEmpty()){
            node = q.poll();
            for (int next : graph[node]){
                if(isVisited[next]==0){
                    ans[next]++;
                    isVisited[next]=1;
                    q.add(next);
                }
            }
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        isVisited = new int[N+1];
        ans = new int[N+1];
        graph = new ArrayList[N+1];
        for (int i=1; i<=N; i++){
            graph[i] = new ArrayList<Integer>();
        }
        for (int i=1; i<=M; i++){
            stk = new StringTokenizer(in.readLine());
            graph[Integer.parseInt(stk.nextToken())].add(Integer.parseInt(stk.nextToken()));
        }
    }
}
