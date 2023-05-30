package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17608 {
    //막대기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());

        int[] stick = new int[N];
        for (int i = 0; i < N; i++) {
            stick[i] = Integer.parseInt(in.readLine());
        }
        int last = stick[N - 1];
        int ans = 1;
        for (int i = N - 1; i >= 0; i--) {
            if (stick[i] > last) {
                ans++;
                last = stick[i];
            }
        }
        System.out.println(ans);
    }
}
