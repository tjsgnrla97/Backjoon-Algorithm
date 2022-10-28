package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_7562 {
    //나이트의 이동
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int T, I;
    static int[][] map;
    static boolean[][] isVisited;
    static int[][] knightDir = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
    static class Point {
        int y, x, cnt;

        public Point(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    }
    static Point start, end;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());
        for (int tc=1; tc<=T; tc++){
            I = Integer.parseInt(in.readLine());
            map = new int[I][I];
            isVisited = new boolean[I][I];

            stk = new StringTokenizer(in.readLine());
            start = new Point(Integer.parseInt(stk.nextToken()),Integer.parseInt(stk.nextToken()),0);
            stk = new StringTokenizer(in.readLine());
            end = new Point(Integer.parseInt(stk.nextToken()),Integer.parseInt(stk.nextToken()),0);

            bfs(start);
        }
    }

    private static void bfs(Point start) {
        Queue<Point> q = new LinkedList<>();
        q.add(start);
        isVisited[start.y][start.x] = true;

        while (!q.isEmpty()){
            Point current = q.poll();
            int currentY = current.y;
            int currentX = current.x;
            int currentCnt = current.cnt;

            if(currentY == end.y && currentX == end.x){
                System.out.println(current.cnt);
                return;
            }
            for (int d=0; d<8; d++){
                int ny = currentY + knightDir[d][0];
                int nx = currentX + knightDir[d][1];

                if(ny>=0 && ny<I && nx>=0 && nx<I && !isVisited[ny][nx]){
                    q.add(new Point(ny,nx,currentCnt+1));
                    isVisited[ny][nx] = true;
                }
            }
        }
    }
}
