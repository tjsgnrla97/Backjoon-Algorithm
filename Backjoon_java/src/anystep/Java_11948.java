package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11948 {
    //과목선택
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] score = new int[6];
        int ans = 0;

        for (int i = 0; i < 6; i++) {
            score[i] = Integer.parseInt(in.readLine());
        }
        Arrays.sort(score, 0, 4);
        Arrays.sort(score, 4, 6);

        for (int i = 1; i < 4; i++) {
            ans += score[i];
        }
        ans += Math.max(score[4], score[5]);
        System.out.println(ans);
    }
}
