package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1225 {
    //이상한 곱셈
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        String A = stk.nextToken();
        String B = stk.nextToken();
        long ans = 0;
        for (int n = 0; n < A.length(); n++) {
            for (int m = 0; m < B.length(); m++) {
                ans += (A.charAt(n) - '0') * (B.charAt(m) - '0');
            }
        }
        System.out.println(ans);
    }
}
