package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_12780 {
    //원피스
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String H = in.readLine();
        String N = in.readLine();
        int idx = -1;
        int ans = 0;
        while (idx != 0 && idx <= H.length()) {
            idx = H.indexOf(N, idx);
            if (idx != -1) ans++;
            idx++;
        }
        System.out.println(ans);
    }
}
