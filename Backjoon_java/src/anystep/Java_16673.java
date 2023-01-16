package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_16673 {
    //고려대학교에는 공식 와인이 있다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int C = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int P = Integer.parseInt(stk.nextToken());
        int sum = 0;
        for (int i = 1; i <= C; i++) {
            sum += K * i + P * i * i;
        }
        System.out.println(sum);
    }
}
