package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5522 {
    //카드 게임
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int ans;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            ans += Integer.parseInt(in.readLine());
        }
        System.out.println(ans);
    }
}
