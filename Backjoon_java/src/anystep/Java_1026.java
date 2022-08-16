package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1026 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<N; i++) A[i] = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<N; i++) B[i] = Integer.parseInt(stk.nextToken());

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i=0; i<N; i++) sum += A[i]*B[N-1-i];
        out.write(sum+"");
        out.flush();
        out.close();
        in.close();
    }
}
