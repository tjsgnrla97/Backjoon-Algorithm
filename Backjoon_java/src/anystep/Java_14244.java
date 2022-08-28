package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14244 {
    //트리 만들기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        for (int i = 0; i < m - 1; i++) {
            System.out.println(i + " " + (m - 1));
        }
        for (int i = m - 1; i < n - 1; i++){
            System.out.println(i + " " + (i + 1));
        }
    }
}
