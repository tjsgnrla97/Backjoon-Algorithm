package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2495 {
    //연속구간
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        for (int tc = 0; tc < 3; tc++) {
            String str = in.readLine();
            int ans = 1;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    ans++;
                    max = Math.max(ans, max);
                } else {
                    ans = 1;
                    max = Math.max(ans, max);
                }
            }
            System.out.println(max);
        }
    }
}
