package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_7569 {
    //토마토
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N,M,H,ans;
    static int[] dy={-1,1,0,0,0,0};
    static int[] dx={0,0,-1,1,0,0};
    static int[] dz={0,0,0,0,1,-1};
    static int[][][] box;
    static Queue<tomato> q;
    static class tomato{
        int z,y,x;

        public tomato(int z, int y, int x) {
            this.z = z;
            this.y = y;
            this.x = x;
        }
    }
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        M = Integer.parseInt(stk.nextToken());
        N = Integer.parseInt(stk.nextToken());
        H = Integer.parseInt(stk.nextToken());
        box = new int[H][N][M];
        q = new LinkedList<>();
        ans = Integer.MIN_VALUE;
        for(int z=0; z<H; z++){
            for(int y=0; y<N; y++){
                stk = new StringTokenizer(in.readLine());
                for(int x=0; x<M; x++){
                    box[z][y][x] = Integer.parseInt(stk.nextToken());
                    if(box[z][y][x]==1) q.add(new tomato(z,y,x));
                }
            }
        }

        BFS();
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }

    private static void BFS() {
        while (!q.isEmpty()){
            tomato current = q.poll();

            int z = current.z;
            int y = current.y;
            int x = current.x;

            for(int d=0; d<6; d++){
                int nz = z + dz[d];
                int ny = y + dy[d];
                int nx = x + dx[d];

                if(ny>=0 && nx>=0 && nz>=0 && nz<H && ny<N && nx<M){
                    if(box[nz][ny][nx]==0){
                        q.add(new tomato(nz,ny,nx));
                        box[nz][ny][nx] = box[z][y][x] + 1;
                    }
                }
            }
        }
        for(int z=0; z<H; z++){
            for(int y=0; y<N; y++){
                for(int x=0; x<M; x++){
                    if(box[z][y][x]==0) {
                        ans= -1;
                        return;
                    }
                    ans = Math.max(ans,box[z][y][x]);
                }
            }
        }
        if(ans==1) {
            ans=0;
            return;
        }
        else {
            ans=ans-1;
            return;
        }
    }
}
