package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17256 {
    //달달함이 넘쳐흘러
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(in.readLine());
        int[] C = new int[3];
        for (int i = 0; i < 3; i++) {
            C[i] = Integer.parseInt(stk.nextToken());
        }
        int bx = C[0] - A[2];
        int bz = C[1] / A[1];
        int by = C[2] - A[0];

        System.out.println(bx + " " + bz + " " + by);
    }
}
