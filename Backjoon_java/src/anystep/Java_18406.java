package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_18406 {
    //럭키 스트레이트
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = in.readLine();

        int A = 0;
        int B = 0;

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() / 2) {
                A += input.charAt(i) - '0';
            } else {
                B += input.charAt(i) - '0';
            }
        }
        if (A == B) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
