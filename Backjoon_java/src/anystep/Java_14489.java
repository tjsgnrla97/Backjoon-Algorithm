package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14489 {
    //치킨 두 마리 (...)
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int sum = Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken());
        int chiken = Integer.parseInt(in.readLine());
        if (sum >= 2 * chiken) {
            System.out.println(sum - (2 * chiken));
        } else {
            System.out.println(sum);
        }
    }
}
