package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5575 {
    //타임 카드
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        for (int tc = 1; tc <= 3; tc++) {
            stk = new StringTokenizer(in.readLine());
            int fh = Integer.parseInt(stk.nextToken());
            int fm = Integer.parseInt(stk.nextToken());
            int fs = Integer.parseInt(stk.nextToken());

            int sh = Integer.parseInt(stk.nextToken());
            int sm = Integer.parseInt(stk.nextToken());
            int ss = Integer.parseInt(stk.nextToken());
            int first = (fh * 3600) + (fm * 60) + fs;
            int second = (sh * 3600) + (sm * 60) + ss;
            int time = second - first;
            int h = time / 3600;
            int m = (time % 3600) / 60;
            int s = (time % 3600) % 60;

            System.out.println(h + " " + m + " " + s);
        }
    }
}
