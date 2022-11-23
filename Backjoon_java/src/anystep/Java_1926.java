package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1926 {
    //그림
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N, M,ansNum,ansArea,painterArea;
    static int[][] painterMap;
    static boolean[][] isVisited;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        input();
        findPainter();
        printAns();
    }

    private static void printAns() throws IOException {
        out.write(ansNum+"\n"+ansArea);
        out.flush();
        out.close();
        in.close();
    }

    private static void findPainter() {
        for (int y=0; y<N; y++){
            for (int x=0; x<M; x++){
                if(!isVisited[y][x]&&painterMap[y][x]==1){
                    ansNum++;
                    dfs(y,x);
                    ansArea = Math.max(ansArea,painterArea);
                    painterArea=0;
                }
            }
        }
    }

    private static void dfs(int y, int x) {
        isVisited[y][x]=true;
        painterArea++;
        for (int d=0; d<4; d++){
            int ny = y+dy[d];
            int nx = x+dx[d];

            if(ny<0 || nx<0 || ny>=N || nx>=M) continue;
            if(painterMap[ny][nx]==1 && !isVisited[ny][nx]) dfs(ny,nx);
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        painterMap = new int[N][M];
        isVisited = new boolean[N][M];
        for (int y=0; y<N; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=0; x<M; x++){
                painterMap[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
    }
}
