package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2745 {
    //진법 변환
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int ans = 0;
        String str = stk.nextToken();
        int b = Integer.parseInt(stk.nextToken());
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && '9' >= str.charAt(i))
                ans = ans * b + (str.charAt(i) - '0');
            else
                ans = ans * b + (str.charAt(i) - 'A' + 10);
        }
        System.out.println(ans);

    }
}
