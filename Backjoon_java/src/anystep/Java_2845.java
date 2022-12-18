package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2845 {
    //파티가 끝나고 난 뒤
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int L = Integer.parseInt(stk.nextToken());
        int P = Integer.parseInt(stk.nextToken());
        int result = L * P;
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < 5; i++) {
            int N = Integer.parseInt(stk.nextToken());
            System.out.print(N - result + " ");
        }
    }
}
