package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_16486 {
    //운동장 한 바퀴
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int d1 = Integer.parseInt(in.readLine());
        int d2 = Integer.parseInt(in.readLine());
        double pi = 3.141592;
        System.out.println(d1 * 2 + 2 * pi * d2);
    }
}
