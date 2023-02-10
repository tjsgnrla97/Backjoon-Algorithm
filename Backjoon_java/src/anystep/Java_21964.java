package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_21964 {
    //선린인터넷고등학교 교가
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String str = in.readLine();
        for (int i = N - 5; i < N; i++) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
