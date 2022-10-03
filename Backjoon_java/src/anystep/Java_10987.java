package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10987 {
    //모음의 개수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int ans;
    public static void main(String[] args) throws IOException {
        String str = in.readLine();
        for(int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if(currectAlpha(current)) ans++;
        }
        System.out.println(ans);
    }

    private static boolean currectAlpha(char current) {
        switch (current) {
            case 'a':
                return true;
            case 'e':
                return true;
            case 'i':
                return true;
            case 'o':
                return true;
            case 'u':
                return true;
            default:
                return false;
        }
    }
}
