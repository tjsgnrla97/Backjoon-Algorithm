package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_16431 {
    //베시와 데이지
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int Bx = Integer.parseInt(stk.nextToken());
        int By = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int Dx = Integer.parseInt(stk.nextToken());
        int Dy = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int Jx = Integer.parseInt(stk.nextToken());
        int Jy = Integer.parseInt(stk.nextToken());
        int B = Math.max(Math.abs(Jx - Bx), Math.abs(Jy - By));
        int D = Math.abs(Jx - Dx) + Math.abs(Jy - Dy);
        if (B == D) System.out.println("tie");
        else if (B < D) System.out.println("bessie");
        else System.out.println("daisy");
    }
}
