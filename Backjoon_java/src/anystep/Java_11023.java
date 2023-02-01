package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11023 {
    //더하기 3
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int sum = 0;
        while (stk.hasMoreTokens()) {
            sum += Integer.parseInt(stk.nextToken());
        }
        System.out.println(sum);
    }
}
