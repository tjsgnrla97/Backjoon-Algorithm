package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15873 {
    //공백 없는 A+B
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String k = in.readLine();

        if (k.contains("1010")) {
            System.out.println(20);
        } else if (k.contains("10")) {
            k = k.replaceAll("10", "");
            System.out.println(Integer.parseInt(k) + 10);
        } else {
            System.out.println(Integer.parseInt(k) / 10 + Integer.parseInt(k) % 10);
        }
    }
}
