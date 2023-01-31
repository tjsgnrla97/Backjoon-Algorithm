package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15726 {
    //이칙연산
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        double A = Double.parseDouble(stk.nextToken());
        double B = Double.parseDouble(stk.nextToken());
        double C = Double.parseDouble(stk.nextToken());
        if (((A * B) / C) > ((A / B) * C)) {
            System.out.println((int) ((A * B) / C));
        } else {
            System.out.println((int) ((A / B) * C));
        }
    }
}
