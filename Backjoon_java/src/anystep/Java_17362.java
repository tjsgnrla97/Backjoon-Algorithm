package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17362 {
    //수학은 체육과목 입니다 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int cnt = 1;
        int flag = -1;
        for (int i = 1; i < N; i++) {
            if (cnt <= 1) {
                flag *= -1;
            }
            cnt += flag;
            if (cnt >= 5) {
                flag *= -1;
            }
        }
        System.out.println(cnt);
    }
}
