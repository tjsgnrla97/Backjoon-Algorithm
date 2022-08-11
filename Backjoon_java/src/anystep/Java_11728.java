package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11728 {
    // 배열 합치기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        int[] A = new int[N];
        int[] B = new int[M];
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<M; i++){
            B[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0;
        int j=0;
        while (i<N && j<M){
            if(A[i]<B[j]) sb.append(A[i++]).append(" ");
            else sb.append(B[j++]).append(" ");
        }
        while (i<N) sb.append(A[i++]).append(" ");
        while (j<M) sb.append(B[j++]).append(" ");
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
