package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_20528 {
    //끝말잇기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        char first = stk.nextToken().charAt(0);
        N--;
        boolean flag = true;
        while (N-- > 0) {
            char chk = stk.nextToken().charAt(0);
            if (first != chk) {
                flag = false;
            }
        }
        if (flag) System.out.println(1);
        else System.out.println(0);
    }
}
