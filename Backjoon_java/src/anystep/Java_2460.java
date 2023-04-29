package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2460 {
    //지능형 기차 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            stk = new StringTokenizer(in.readLine());
            sum -= Integer.parseInt(stk.nextToken());
            sum += Integer.parseInt(stk.nextToken());
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
