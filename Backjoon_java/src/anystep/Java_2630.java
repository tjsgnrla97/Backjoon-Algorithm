package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2630 {
    //색종이 만들기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] color = new int[2];
    static int[][] paper;
    public static void main(String[] args) throws IOException {
        input();
        divide(N,0,0);
        printColor();
    }

    private static void printColor() {
        for (int ans : color){
            System.out.println(ans);
        }
    }

    private static void divide(int currentN, int startY, int startX) {
        for (int y=startY; y<startY+currentN; y++){
            for (int x=startX; x<startX+currentN; x++){
                if(paper[startY][startX] != paper[y][x]){
                    divide(currentN/2,startY,startX);
                    divide(currentN/2,startY+currentN/2,startX);
                    divide(currentN/2,startY,startX+currentN/2);
                    divide(currentN/2,startY+currentN/2,startX+currentN/2);
                    return;
                }
            }
        }
        color[paper[startY][startX]]++;
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        paper = new int[N][N];
        for (int y=0; y<N; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=0; x<N; x++){
                paper[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
    }
}
