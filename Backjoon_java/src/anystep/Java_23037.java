package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_23037 {
    //5의 수난
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String N = in.readLine();
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            ans += Math.pow(Integer.parseInt(N.charAt(i) + ""), 5);
        }
        System.out.println(ans);
    }
}
