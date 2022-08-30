package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_11725 {
    //트리의 부모 찾기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
    static int[] parents;
    static int N;
    public static void main(String[] args) throws IOException {
        input();
        bfs(1);
        printAns(parents);
    }
    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        //인접리스트 초기화
        parents = new int[N+1];
        for (int i=0; i<=N+1; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        //인접리스트 연결
        int from, to;
        for(int i=1; i<N; i++){
            stk = new StringTokenizer(in.readLine());
            from = Integer.parseInt(stk.nextToken());
            to = Integer.parseInt(stk.nextToken());
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }
    }
    private static void bfs(int start) {
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.offer(start);
        parents[start] = 1;

        while (!q.isEmpty()) {
            int currentParent = q.poll();

            for (int child : adjList.get(currentParent)) {
                if(parents[child] == 0) {
                    parents[child] = currentParent;
                    q.offer(child);
                }
            }
        }
    }
    private static void printAns(int[] parents) {
        for (int i=2; i<parents.length; i++) {
            System.out.println(parents[i]);
        }
    }
}
