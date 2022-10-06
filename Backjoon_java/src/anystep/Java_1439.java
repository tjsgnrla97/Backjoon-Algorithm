package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1439 {
    //뒤집기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static String S;
    static int ans, idx;
    public static void main(String[] args) throws IOException {
        S = in.readLine();
        idx = 1;
        if (S.length() > 0) {
            char current = S.charAt(0);

            while (idx < S.length()) {
                if (S.charAt(idx) == current) {
                    idx++;
                    continue;
                }
                ans++;
                for (int i = idx; i < S.length(); i++) {
                    if(S.charAt(i) == current) {
                        break;
                    }
                    idx++;
                }
            }
        }
        System.out.println(ans);
    }
}
