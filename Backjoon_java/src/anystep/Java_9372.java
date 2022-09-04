package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_9372 {
    //상근이의 여행
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int T, N, M, ans;
    static int[][] arr;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }

    private static void solve() throws IOException {
        for (int tc = 1; tc <= T; tc++) {
            stk = new StringTokenizer(in.readLine());
            N = Integer.parseInt(stk.nextToken());
            M = Integer.parseInt(stk.nextToken());
            ans = 0;

            arr = new int[N+1][N+1];
            isVisited = new boolean[N+1];
            for (int i = 0; i < M; i++) {
                stk = new StringTokenizer(in.readLine());
                int from = Integer.parseInt(stk.nextToken());
                int to = Integer.parseInt(stk.nextToken());
                arr[from][to] = arr[to][from] = 1;
            }
            bfs();
            out.write((ans-1)+"\n");
            out.flush();
        }
        out.close();
        in.close();
    }

    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        isVisited[1] = true;
        while (!q.isEmpty()){
            ans++;
            int from = q.poll();
            for (int to=1; to<=N; to++) {
                if(arr[from][to] != 0 && !isVisited[to]) {
                    isVisited[to] = true;
                    q.add(to);
                }
            }
        }
    }

    private static void input() throws IOException {
        T  = Integer.parseInt(in.readLine());
    }
}
