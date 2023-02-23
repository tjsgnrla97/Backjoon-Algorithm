package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1919 {
    //애너그램만들기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] alpha = new int[26];
        boolean chk = true;
        int cnt = 0;
        int sum = 0;
        char[] A = in.readLine().toCharArray();
        char[] B = in.readLine().toCharArray();

        for (char ch : A) alpha[ch - 97]++;
        for (char ch : B) alpha[ch - 97]--;

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = Math.abs(alpha[i]);

            if (alpha[i] != 0) {
                sum += alpha[i];
            }
        }
        System.out.println(sum);
    }
}
