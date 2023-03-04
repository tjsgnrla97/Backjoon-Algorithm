package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2443 {
    //별 찍기 - 6
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < y; x++) {
                System.out.print(" ");
            }
            for (int x = 0; x < 2 * (N - y) - 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
