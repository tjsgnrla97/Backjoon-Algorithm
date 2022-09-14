package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_2206 {
    //벽 부수고 이동하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, M;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};
    static int[][] map, dist;
    static boolean[][][] isVisited;
    static Queue<int[]> q;
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        if(N-1 == 0 && M-1==0) {
            System.out.print(1);
            System.exit(0);
        }

        map = new int[N][M];
        dist = new int[N][M];
        isVisited = new boolean[2][N][M];
        q = new LinkedList<>();

        for(int y=0; y<N; y++) {
            String[] str = in.readLine().split("");
            for(int x=0; x<M; x++) {
                map[y][x] = Integer.parseInt(str[x]);
            }
        }
        //시작점 (y,x,벽부순여부)
        q.add(new int[]{0,0,0});
        while (!q.isEmpty()){
            int[] now = q.poll();

            for(int d=0; d<4; d++) {
                int ny = now[0]+dy[d];
                int nx = now[1]+dx[d];

                if(ny<0||ny>=N||nx<0||nx>=M) continue;

                //다음 칸에 벽이 있으면
                //1 벽을 부순적 있나 체크
                //2 그 벽을 방문한적 있는가 체크
                if(map[ny][nx]==1){
                    if(now[2]==0 && !isVisited[1][ny][nx]){
                        isVisited[now[2]][ny][nx] = true;
                        dist[ny][nx] = dist[now[0]][now[1]]+1;
                        q.add(new int[]{ny,nx,1});
                    }
                }
                //벽이 아닐 경우 -> 벽을 부순 여부에 따른 방문을 했나 체크
                else{
                    if(!isVisited[now[2]][ny][nx]){
                        isVisited[now[2]][ny][nx] = true;
                        dist[ny][nx] = dist[now[0]][now[1]]+1;
                        q.add(new int[]{ny,nx,now[2]});
                    }
                }
                if(ny==N-1 && nx==M-1){
                    System.out.print(dist[ny][nx]+1);
                    System.exit(0);
                }
            }
        }
        System.out.print(-1);
    }
}
