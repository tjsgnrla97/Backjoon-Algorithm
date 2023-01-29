package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_20499 {
    //Darius님 한타 안 함?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine(), "/");
        int K = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());
        int A = Integer.parseInt(stk.nextToken());
        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
