package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2440 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int i=1; i<=N; i++){
            for(int j=1; j<=N-i+1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
