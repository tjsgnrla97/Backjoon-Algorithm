package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15963 {
    //CASIO
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        String strA = stk.nextToken();
        String strB = stk.nextToken();
        System.out.println(strA.equals(strB)?1:0);
    }
}
