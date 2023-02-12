package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25640 {
    //MBTI
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String JINHO = in.readLine();
        int N = Integer.parseInt(in.readLine());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (JINHO.equals(in.readLine())) ans++;
        }
        System.out.println(ans);
    }
}
