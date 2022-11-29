package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2902 {
    //KMP는 왜 KMP일까?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static String ans="";
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine(),"-");
        while (stk.hasMoreElements()){
            ans += stk.nextToken().charAt(0)+"";
        }
        System.out.println(ans);
    }
}
