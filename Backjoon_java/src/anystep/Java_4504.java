package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4504 {
    //배수찾기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        while (true) {
            int num = Integer.parseInt(in.readLine());
            if (num == 0) break;
            if (num % N == 0) {
                System.out.println(num + " is a multiple of " + N + ".");
            } else {
                System.out.println(num + " is NOT a multiple of " + N + ".");
            }
        }
    }
}
