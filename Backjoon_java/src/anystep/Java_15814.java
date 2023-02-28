package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15814 {
    //야바위 대장
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        int T = Integer.parseInt(in.readLine());

        char[] chArr = str.toCharArray();

        for (int tc = 0; tc < T; tc++) {
            stk = new StringTokenizer(in.readLine());
            int A = Integer.parseInt(stk.nextToken());
            int B = Integer.parseInt(stk.nextToken());

            char temp = chArr[A];
            chArr[A] = chArr[B];
            chArr[B] = temp;
        }
        for (char ch : chArr) {
            System.out.print(ch);
        }
    }
}
