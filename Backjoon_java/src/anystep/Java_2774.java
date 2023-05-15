package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2774 {
    //아름다운 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            long X = Long.parseLong(in.readLine());
            boolean[] num = new boolean[10];
            while (X != 0) {
                num[(int) (X % 10L)] = true;
                X /= 10;
            }
            int ans = 0;
            for (int i = 0; i < 10; i++) {
                if (num[i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
