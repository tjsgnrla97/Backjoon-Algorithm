package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17388 {
    //와글와글 숭고한
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int S = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int H = Integer.parseInt(stk.nextToken());

        if (S + K + H >= 100) {
            System.out.println("OK");
        } else {
            if (Math.min(S, Math.min(K, H)) == S) {
                System.out.println("Soongsil");
            } else if (Math.min(S, Math.min(K, H)) == K) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
