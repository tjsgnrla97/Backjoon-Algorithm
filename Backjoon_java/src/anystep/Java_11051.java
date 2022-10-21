package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11051 {
    //이항 계수 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());

        int[][] comb = new int[N+1][N+1];

        for (int n = 0; n < comb.length; n++) {
            for (int k = 0; k <= n; k++) {
                if(n == k || k == 0) {
                    comb[n][k] = 1;
                }
                else {
                    comb[n][k] = (comb[n-1][k-1]+comb[n-1][k]) % 10007;
                }
            }
        }
        System.out.println(comb[N][K]);
    }
}
