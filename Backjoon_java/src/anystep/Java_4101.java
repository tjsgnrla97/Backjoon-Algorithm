package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4101 {
    //크냐?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            stk = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            if (a == 0 && b == 0) break;

            System.out.println(a > b ? "Yes" : "No");
        }
    }
}
