package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_9085 {
    //더하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int ans = 0;
            int N = Integer.parseInt(in.readLine());
            stk = new StringTokenizer(in.readLine());
            for (int i = 0; i < N; i++) {
                ans += Integer.parseInt(stk.nextToken());
            }
            System.out.println(ans);
        }
    }
}
