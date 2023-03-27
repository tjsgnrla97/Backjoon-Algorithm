package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1408 {
    //24
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int now = 0;
        int start = 0;

        stk = new StringTokenizer(in.readLine(), ":");
        int h = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int s = Integer.parseInt(stk.nextToken());

        now = (h * 3600) + (m * 60) + s;

        stk = new StringTokenizer(in.readLine(), ":");
        h = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        s = Integer.parseInt(stk.nextToken());

        start = (h * 3600) + (m * 60) + s;

        int time = 0;

        if (start > now) {
            time = start - now;
        } else {
            time = (24 * 3600) - (now - start);
        }
        System.out.format("%02d:%02d:%02d", (time / 3600), ((time / 60) % 60), (time % 60));
    }
}
