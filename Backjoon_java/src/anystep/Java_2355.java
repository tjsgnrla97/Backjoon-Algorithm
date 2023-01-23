package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2355 {
    //시그마
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        long a = Integer.parseInt(stk.nextToken());
        long b = Integer.parseInt(stk.nextToken());

        if (b > a) {
            long temp = b;
            b = a;
            a = temp;
        }

        long result = (a + b) * (a - b + 1) / 2;
        System.out.println(result);
    }
}
