package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11048 {
    //이동하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int[][] map = new int[N+1][M+1];

        int max = -1;

        for (int y = 1; y <= N; y++) {
            stk = new StringTokenizer(in.readLine());
            for (int x = 1; x <= M; x++) {
                map[y][x] = Integer.parseInt(stk.nextToken());

                //왼쪽, 왼쪽대각선, 위
                max = Math.max(map[y][x-1], Math.max(map[y-1][x-1],map[y-1][x]));
                map[y][x] += max;
            }
        }
        System.out.println(map[N][M]);
    }
}
