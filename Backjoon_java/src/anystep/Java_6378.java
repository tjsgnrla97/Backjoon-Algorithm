package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_6378 {
    //디지털 루트
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        while (true) {
            String N = in.readLine();
            if (N.equals("0")) break;
            while (true) {
                int sum = 0;
                if (N.length() < 2) break;
                else {
                    for (int i = 0; i < N.length(); i++) {
                        sum += N.charAt(i) - '0';
                    }
                }
                N = String.valueOf(sum);
            }
            System.out.println(N);
        }
    }
}
