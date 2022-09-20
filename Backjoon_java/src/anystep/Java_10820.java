package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10820 {
    //문자열 분석
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String input = "";
        while ((input = in.readLine()) != null) {
            char str[] = input.toCharArray();
            int small = 0, capital = 0, num = 0, blank = 0;
            for (char ch : str) {
                if ('a' <= ch && ch <= 'z')
                    small++;
                else if ('A' <= ch && ch <= 'Z')
                    capital++;
                else if ('0' <= ch && ch <= '9')
                    num++;
                else
                    blank++;
            }
            System.out.printf("%d %d %d %d\n", small, capital, num, blank);
        }
    }
}
