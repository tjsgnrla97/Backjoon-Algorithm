package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11724 {
    //연결 요소의 개수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, M, ans;
    static int[][] adjMatrix;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        input();
        link();
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }

    private static void link() {
        for(int from=1; from<N+1; from++) {
            if(!isVisited[from]) {
                dfs(from);
                ans++;
            }
        }
    }

    private static void dfs(int from) {
        isVisited[from] = true;

        for(int to=1; to<=N; to++) {
            if(adjMatrix[from][to]==1 && !isVisited[to]) {
                dfs(to);
            }
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        adjMatrix = new int[N+1][N+1];
        isVisited = new boolean[N+1];

        for(int e=0; e<M; e++) {
            stk = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(stk.nextToken());
            int to = Integer.parseInt(stk.nextToken());
            adjMatrix[from][to] = adjMatrix[to][from] = 1;
        }

    }
}
