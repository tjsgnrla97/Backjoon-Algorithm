package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14581 {
    //팬들에게 둘러싸인 홍준
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        sb.append(":fan::fan::fan:").append("\n");
        sb.append(":fan::").append(str).append("::fan:").append("\n");
        sb.append(":fan::fan::fan:");
        System.out.println(sb.toString());
    }
}
