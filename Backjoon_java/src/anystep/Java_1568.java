package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1568 {
    //오각형, 오각형, 오각형…
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int bird = 1;
        int ans = 0;
        while (N >= 1) {
            if (N < bird) {
                bird = 1;
            }
            N -= bird;
            bird++;
            ans++;
        }
        System.out.println(ans);
    }
}
