package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2530 {
    //인공지능 시계
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        int HH = Integer.parseInt(stk.nextToken());
        int MM = Integer.parseInt(stk.nextToken());
        int SS = Integer.parseInt(stk.nextToken());

        int ADD = Integer.parseInt(in.readLine());

        MM += ADD / 60;
        SS += ADD % 60;

        MM += SS / 60;
        SS = SS % 60;

        HH += MM / 60;
        MM = MM % 60;

        HH = HH % 24;

        System.out.println(HH + " " + MM + " " + SS);
    }
}
