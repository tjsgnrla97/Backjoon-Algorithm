package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_24416 {
    //알고리즘 수업 - 피보나치 수1
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int[] memo;
    static int code1 = 0;
    static int code2 = 0;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        memo = new int[N];
        playOne(N);
        playTwo(N);
        System.out.println(code1 + " " + code2);
    }

    private static int playTwo(int n) {
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            code2++;
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo[n - 1];
    }

    private static int playOne(int n) {
        if (n == 1 || n == 2) {
            code1++;
            return 1;
        }
        return playOne(n - 1) + playOne(n - 2);
    }
}
