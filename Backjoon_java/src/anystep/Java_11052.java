package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11052 {
    //카드구매하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] cardPack = new int[N+1];
        int[] maxCost = new int[N+1];
        stk = new StringTokenizer(in.readLine());

        for (int i = 1; i <= N; i++) {
            cardPack[i] = Integer.parseInt(stk.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                maxCost[i] = Math.max(maxCost[i], cardPack[j]+maxCost[i-j]);
            }
        }
        System.out.println(maxCost[N]);
    }
}
