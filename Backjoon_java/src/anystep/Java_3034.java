package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3034 {
    //앵그리 창영
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int W = Integer.parseInt(stk.nextToken());
        int H = Integer.parseInt(stk.nextToken());

        for (int i = 0; i < N; i++) {
            int D = Integer.parseInt(in.readLine());
            if ((W * W) + (H * H) >= (D * D)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
