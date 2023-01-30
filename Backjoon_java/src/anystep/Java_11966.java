package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11966 {
    //2의 제곱인가?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        while (N != 1) {
            if (N % 2 == 1) {
                System.out.println(0);
                return;
            }
            N /= 2;
        }
        System.out.println(1);
    }
}
