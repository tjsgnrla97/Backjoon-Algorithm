package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_16172 {
    //나는 친구가 적다 (Large)
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String parent = in.readLine().replaceAll("[0-9]", "");
        String pattern = in.readLine();

        System.out.println(kmp(parent, pattern) ? 1 : 0);
    }

    private static boolean kmp(String parent, String pattern) {
        int[] table = makeTable(pattern);

        int n1 = parent.length();
        int n2 = pattern.length();

        int idx = 0;
        for (int i = 0; i < n1; i++) {
            while (idx > 0 && parent.charAt(i) != pattern.charAt(idx)) {
                idx = table[idx - 1];
            }
            if (parent.charAt(i) == pattern.charAt(idx)) {
                if (idx == n2 - 1) {
                    idx = table[idx];
                    return true;
                } else {
                    idx++;
                }
            }
        }
        return false;
    }

    private static int[] makeTable(String pattern) {
        int n = pattern.length();
        int[] table = new int[n];

        int idx = 0;
        for (int i = 1; i < n; i++) {
            while (idx > 0 && pattern.charAt(i) != pattern.charAt(idx)) {
                idx = table[idx - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(idx)) {
                idx++;
                table[i] = idx;
            }
        }
        return table;
    }
}
