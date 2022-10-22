package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11660 {
    //구간 합 구하기 5
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[][] Sum = new int[N+1][N+1];
        for (int y = 1; y < N + 1; y++) {
            stk = new StringTokenizer(in.readLine());
            for (int x = 1; x < N + 1; x++) {
                Sum[y][x] = Sum[y][x-1] + Sum[y-1][x] - Sum[y-1][x-1] + Integer.parseInt(stk.nextToken());
            }
        }
        int ans = 0;
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(in.readLine());
            int x1 = Integer.parseInt(stk.nextToken());
            int y1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            int y2 = Integer.parseInt(stk.nextToken());
            ans = Sum[x2][y2] - Sum[x1-1][y2] - Sum[x2][y1-1] + Sum[x1-1][y1-1];
            System.out.println(ans);
        }
    }
}
