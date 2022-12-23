package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11365 {
    //!밀비 급일
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = in.readLine();
            if (str.equals("END")) break;
            StringBuilder reverse = new StringBuilder(str);
            reverse = reverse.reverse();
            sb.append(reverse).append("\n");
        }
        System.out.print(sb);
    }
}
