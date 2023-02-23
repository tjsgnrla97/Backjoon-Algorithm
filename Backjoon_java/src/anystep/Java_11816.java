package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11816 {
    //8진수, 10진수, 16진수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String X = in.readLine();
        String N = "";
        int N8 = 0;
        int N16 = 0;

        if (X.charAt(0) == '0') {
            if (X.charAt(1) == 'x') {
                for (int i = 2; i < X.length(); i++) {
                    N += X.charAt(i);
                }
                N16 = Integer.valueOf(N, 16);
            } else {
                for (int i = 1; i < X.length(); i++) {
                    N += X.charAt(i);
                }
                N8 = Integer.valueOf(N, 8);
            }
        } else {
            System.out.println(X);
        }
        if (N8 != 0 || N16 != 0) {
            System.out.println(N8 > N16 ? N8 : N16);
        }
    }
}
