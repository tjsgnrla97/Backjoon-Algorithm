package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11944 {
    //NN
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        String n = stk.nextToken();
        int N = Integer.valueOf(n);
        int M = Integer.valueOf(stk.nextToken());
        int len = n.length();

        for (int i = 0; i < N * len && i <= M; i += len) {
            sb.append(n);
        }

        if (sb.length() > M) {
            System.out.print(sb.toString().substring(0, M));
        } else {
            System.out.print(sb.toString());
        }
    }
}
