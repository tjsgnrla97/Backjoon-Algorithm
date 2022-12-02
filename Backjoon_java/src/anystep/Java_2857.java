package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2857 {
    //FBI
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int ans;

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 5; i++) {
            if (in.readLine().contains("FBI")) {
                ans = i;
                sb.append(i).append(" ");
            }
        }
        if (ans != 0) System.out.println(sb.toString());
        else System.out.println("HE GOT AWAY!");
    }
}
