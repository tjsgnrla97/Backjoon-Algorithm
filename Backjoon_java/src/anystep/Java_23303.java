package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_23303 {
    //이 문제는 D2 입니다.
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = in.readLine().toLowerCase();
        System.out.println(str.indexOf("d2") != -1 ? "D2" : "unrated");
    }
}
