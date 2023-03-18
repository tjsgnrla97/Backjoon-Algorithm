package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_27866 {
    //문자와 문자열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        int i = Integer.parseInt(in.readLine());
        System.out.println(str.charAt(i-1));
    }
}
