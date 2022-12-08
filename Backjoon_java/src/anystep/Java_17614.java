package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17614 {
    //369
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, ans, num;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(in.readLine());
        for (int i = 1; i <= N; i++) {
            num = i;
            while (num != 0) {
                if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
                    ans++;
                }
                num /= 10;
            }
        }
        System.out.println(ans);
    }
}
