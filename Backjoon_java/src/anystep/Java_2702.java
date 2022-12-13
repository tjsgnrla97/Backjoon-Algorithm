package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2702 {
    //초6 수학
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());

        for (int tc = 1; tc <= T; tc++) {
            stk = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            int gcd = getGCD(a, b);
            System.out.print(a * b / gcd + " ");
            System.out.println(gcd);
        }
    }

    private static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
