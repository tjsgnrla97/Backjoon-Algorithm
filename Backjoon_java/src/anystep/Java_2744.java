package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2744 {
    //대소문자 바꾸기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String ans = in.readLine();
        for(int i=0; i<ans.length(); i++) {
            char c = ans.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.print(String.valueOf(c).toLowerCase());
            }else {
                System.out.print(String.valueOf(c).toUpperCase());
            }
        }
    }
}
