package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_20540 {
    //연길이의 이상형
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        String[] mbti = new String[str.length()];
        for (int i = 0; i < mbti.length; i++) {
            mbti[i] = str.substring(i, i + 1);
        }
        System.out.print(mbti[0].equals("E") ? "I" : "E");
        System.out.print(mbti[1].equals("S") ? "N" : "S");
        System.out.print(mbti[2].equals("T") ? "F" : "T");
        System.out.print(mbti[3].equals("J") ? "P" : "J");
    }
}
