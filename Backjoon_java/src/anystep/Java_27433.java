package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_27433 {
    //팩토리얼 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            if (N == 0) {
                System.out.println(1);
            } else {
                ans *= i;
            }
        }
        System.out.println(ans);
    }
}
