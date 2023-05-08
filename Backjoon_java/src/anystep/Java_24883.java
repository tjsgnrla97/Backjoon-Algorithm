package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_24883 {
    //자동완성
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        if (str.equals("N") || str.equals("n")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}
