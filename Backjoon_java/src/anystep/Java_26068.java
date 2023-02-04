package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_26068 {
    //치킨댄스를 추는 곰곰이를 본 임스 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int ans = 0;
        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            String num = str.substring(2);
            if (Integer.parseInt(num) <= 90) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
