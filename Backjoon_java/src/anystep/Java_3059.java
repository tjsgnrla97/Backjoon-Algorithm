package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3059 {
    //등장하지 않는 문자의 합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String input = in.readLine();
            boolean[] alpha = new boolean[26];
            for (int i = 0; i < input.length(); i++) {
                if (!alpha[input.charAt(i) - 'A']) alpha[input.charAt(i) - 'A'] = true;
            }
            int ans = 0;
            int cnt = 0;
            for (int i = 0; i < alpha.length; i++) {
                if (!alpha[i]) {
                    ans += i;
                    cnt++;
                }
            }
            ans += cnt * 65;
            System.out.print(ans + "\n");
        }
    }
}
