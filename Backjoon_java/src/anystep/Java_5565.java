package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5565 {
    //영수증
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int ans = Integer.parseInt(in.readLine());
        for (int i = 0; i < 9; i++) {
            ans -= Integer.parseInt(in.readLine());
        }
        System.out.println(ans);
    }
}
