package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11945 {
    //뜨거운 붕어빵
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int x = Integer.parseInt(stk.nextToken());
        int y = Integer.parseInt(stk.nextToken());
        for (int i = 0; i < x; i++) {
            String str = in.readLine();
            for (int j = 0; j < y; j++) {
                out.write(str.charAt(y - j - 1));
            }
            out.write("\n");
        }
        out.flush();
    }
}
