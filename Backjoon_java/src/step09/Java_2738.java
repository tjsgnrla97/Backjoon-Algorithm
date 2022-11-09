package step09;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2738 {
    //1. 행렬 덧셈
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    static int N, M;
    static int[][] A, B,ans;
    public static void main(String[] args) throws IOException {
        input();
        APlusB();
        printAns();
    }

    private static void printAns() throws IOException {
        for (int y=0; y<N; y++){
            for (int x=0; x<M; x++){
                sb.append(ans[y][x]).append(" ");
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }

    private static void APlusB() {
        for (int y=0; y<N; y++){
            for (int x=0; x<M; x++){
                ans[y][x] = A[y][x]+B[y][x];
            }
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        A = new int[N][M];
        B = new int[N][M];
        ans = new int[N][M];
        for (int y=0; y<N; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=0; x<M; x++){
                A[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
        for (int y=0; y<N; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=0; x<M; x++){
                B[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
    }
}
