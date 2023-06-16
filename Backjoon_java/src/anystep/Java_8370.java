package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_8370 {
    //Plane
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N_1 = Integer.parseInt(stk.nextToken());
        int K_1 = Integer.parseInt(stk.nextToken());
        int N_2 = Integer.parseInt(stk.nextToken());
        int K_2 = Integer.parseInt(stk.nextToken());
        System.out.println(N_1 * K_1 + N_2 * K_2);
    }
}
