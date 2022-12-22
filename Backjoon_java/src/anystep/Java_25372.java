package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25372 {
    //성택이의 은밀한 비밀번호
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            if (str.length() >= 6 && str.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
