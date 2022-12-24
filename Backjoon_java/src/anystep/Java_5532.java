package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5532 {
    //방학 숙제
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int L = Integer.parseInt(in.readLine());
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());
        int D = Integer.parseInt(in.readLine());
        int korean = A / C;
        int math = B / D;
        if (A % C != 0) korean++;
        if (B % D != 0) math++;
        int ans = Math.max(korean, math);
        System.out.println(L - ans);
    }
}
