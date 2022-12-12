package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1284 {
    //집 주소
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            int cnt = 0;
            String str = in.readLine();

            if (str.equals("0")) System.exit(0);
            for (int i = 0; i < str.length(); i++) {
                String num = str.substring(i, i + 1);
                if (num.equals("1")) cnt += 3;
                else if (num.equals("0")) cnt += 5;
                else cnt += 4;
            }
            System.out.println(cnt + 1);
        }
    }
}
