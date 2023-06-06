package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17202 {
    //핸드폰 번호 궁합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str1 = in.readLine();
        String str2 = in.readLine();
        String ans = "";
        for (int i = 0; i < str1.length(); i++) {
            ans += str1.charAt(i);
            ans += str2.charAt(i);
        }
        while (ans.length() > 2) {
            String Ans = "";
            for (int i = 0; i < ans.length() - 1; i++) {
                int N = Character.getNumericValue(ans.charAt(i)) + Character.getNumericValue(ans.charAt(i + 1));
                Ans += Integer.toString(N % 10);
            }
            ans = Ans;
        }
        System.out.println(ans);
    }
}
