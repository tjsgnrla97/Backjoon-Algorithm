package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1371 {
    //가장 많은 글자
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str;
        while ((str = in.readLine()) != null) {
            sb.append(str);
        }
        int[] alpha = new int[26];
        for (char ch : sb.toString().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                final int idx = ch - 'a';
                alpha[idx]++;
            }
        }
        int max = Arrays.stream(alpha).max().getAsInt();

        for (int i = 0; i < 26; i++) {
            if (alpha[i] == max) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
