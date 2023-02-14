package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15813 {
    //너의 이름은 몇 점이니?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int temp = str.charAt(i) - 64;
            ans += temp;
        }
        System.out.println(ans);
    }
}
