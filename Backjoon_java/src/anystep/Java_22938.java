package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_22938 {
    //백발백준하는 명사수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int x1 = Integer.parseInt(stk.nextToken());
        int y1 = Integer.parseInt(stk.nextToken());
        int r1 = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int x2 = Integer.parseInt(stk.nextToken());
        int y2 = Integer.parseInt(stk.nextToken());
        int r2 = Integer.parseInt(stk.nextToken());
        if(1L*(x1-x2)*(x1-x2)+1L*(y1-y2)*(y1-y2)<1L*(r1+r2)*(r1+r2)) sb.append("YES");
        else sb.append("NO");
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
