package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_7567 {
    //그릇
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        int ans = 10;

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)==str.charAt(i-1)) ans += 5;
            else ans += 10;
        }
        System.out.println(ans);
    }
}
