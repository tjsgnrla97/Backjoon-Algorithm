package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11283 {
    //한글 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String input = in.readLine();
        char ans = input.charAt(0);

        System.out.println((int) ans - 44031);
    }
}
