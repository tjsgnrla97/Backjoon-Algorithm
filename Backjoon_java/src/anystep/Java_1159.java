package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1159 {
    //농구 경기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int N = Integer.parseInt(in.readLine());
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            String name = in.readLine();
            char ch = name.charAt(0);
            arr[ch - 97]++;
            if (arr[ch - 97] == 5) flag = true;
        }
        if (flag) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char) (i + 97));
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}
