package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_5554 {
    //파티가 끝나고 난 뒤
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += Integer.parseInt(in.readLine());
        }
        int min = result / 60;
        int sec = result % 60;
        System.out.println(min);
        System.out.println(sec);
    }
}
