package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10707 {
    //수도요금
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());
        int D = Integer.parseInt(in.readLine());
        int P = Integer.parseInt(in.readLine());
        int X = A * P;
        int Y;
        if (C < P) {
            Y = B + ((P - C) * D);
        } else {
            Y = B;
        }
        System.out.println(Math.min(X, Y));
    }
}
