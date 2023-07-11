package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1652 {
    //누울 자리를 찾아라
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        char[][] map = new char[N][N];
        for (int y = 0; y < N; y++) {
            map[y] = in.readLine().replaceAll(" ", "").toCharArray();
        }
        int xAns = 0;
        int yAns = 0;
        for (int y = 0; y < N; y++) {
            int xCnt = 0;
            int yCnt = 0;
            for (int x = 0; x < N; x++) {
                if(map[y][x]=='.') xCnt++;
                if(map[y][x]=='X'||(x==N-1)){
                    if(xCnt>=2) xAns++;
                    xCnt=0;
                }
                if(map[x][y]=='.') yCnt++;
                if(map[x][y]=='X'||(x==N-1)){
                    if(yCnt>=2) yAns++;
                    yCnt=0;
                }
            }
        }
        System.out.println(xAns + " " + yAns);
    }
}
