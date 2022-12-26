package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15964 {
    //이상한 기호
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        Long A = Long.parseLong(stk.nextToken());
        Long B = Long.parseLong(stk.nextToken());
        System.out.println((A + B) * (A - B));
    }
}
