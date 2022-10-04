package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11047 {
    //동전 0
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int[] coin = new int[N];
        int ans=0;

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(in.readLine());
        }

        for (int i = N-1; i >= 0; i--) {
            if(K >= coin[i]) {
                ans += (K / coin[i]);
                K = (K % coin[i]);
            }
        }
        System.out.println(ans);
    }
}
