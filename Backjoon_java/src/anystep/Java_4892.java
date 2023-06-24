package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4892 {
    //숫자 맞추기 게임
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int cnt = 1;
        while (true) {
            int N = Integer.parseInt(in.readLine());

            if (N == 0) break;

            if (N % 2 == 0) {
                N = (((N * 3) / 2) * 3) / 9;
                System.out.println(cnt + ". even " + N);
            } else {
                N = ((((N * 3) + 1) / 2) * 3) / 9;
                System.out.println(cnt + ". odd " + N);
            }
            cnt++;
        }
    }
}
