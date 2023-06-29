package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4299 {
    //AFC 윔블던
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());

        if ((A + B) % 2 != 0 || A < B) {
            System.out.println(-1);
        } else {
            System.out.println(((A + B) / 2) + " " + (((A + B) / 2) - B));
        }
    }
}
