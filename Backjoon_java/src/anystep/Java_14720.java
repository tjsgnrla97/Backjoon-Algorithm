package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14720 {
    //우유 축제
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        int ans = 0;
        int cmd = 0;
        int[] milk = new int[N];
        for (int i = 0; i < N; i++) {
            milk[i] = Integer.parseInt(stk.nextToken());
        }
        for (int i = 0; i < N; i++) {
            if (cmd == milk[i] && cmd == 0) {
                ans++;
                cmd = 1;
            } else if (cmd == milk[i] && cmd == 1) {
                ans++;
                cmd = 2;
            } else if (cmd == milk[i] && cmd == 2) {
                ans++;
                cmd = 0;
            }
        }
        System.out.println(ans);
    }
}
