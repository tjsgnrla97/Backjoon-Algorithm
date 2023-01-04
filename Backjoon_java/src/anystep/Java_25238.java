package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25238 {
    //가희와 방어율 무시
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        boolean dmg = true;
        if (a * (100 - b) >= 10000) {
            dmg = false;
        }
        System.out.println(dmg ? 1 : 0);
    }
}
