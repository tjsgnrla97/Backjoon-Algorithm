package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14916 {
    //4. 거스름돈
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N, ans;

    public static void main(String[] args) throws IOException {
        input();
        while (N != 0) {
            if (N == 1 || N == 3) {
                ans = -1;
                break;
            } else if (N % 5 == 0) {
                ans += N / 5;
                N %= 5;
            } else if (N % 5 != 0) {
                if ((N % 5) % 2 == 0) {
                    ans += N / 5;
                    N %= 5;
                    ans += N / 2;
                    N %= 2;
                } else if ((N % 5) % 2 != 0) {
                    ans += (N / 5) - 1;
                    N %= 5;
                    N += 5;
                    if (N % 2 == 0) {
                        ans += N / 2;
                        N %= 2;
                    }
                } else {
                    ans = -1;
                }
            }
        }
        System.out.println(ans);
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
    }
}
