package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_13420 {
    //사칙연산
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            char[] form = in.readLine().replaceAll(" ", "").toCharArray();
            String first = "";
            char exp;
            String second = "";
            String result = "";
            int k = 0;
            for (int i = 0; true; i++) {
                if (i > 0 && (form[i] == '+' || form[i] == '-' || form[i] == '*' || form[i] == '/')) {
                    k = i + 1;
                    exp = form[i];
                    break;
                } else first += form[i];
            }
            for (int i = k; true; i++) {
                if (form[i] == '=') {
                    k = i + 1;
                    break;
                } else second += form[i];
            }
            for (int i = k; i < form.length; i++)
                result += form[i];

            long ans = 0;
            if (exp == '+') ans = Long.parseLong(first) + Long.parseLong(second);
            if (exp == '-') ans = Long.parseLong(first) - Long.parseLong(second);
            if (exp == '*') ans = Long.parseLong(first) * Long.parseLong(second);
            if (exp == '/') ans = Long.parseLong(first) / Long.parseLong(second);

            System.out.println(ans == Long.parseLong(result) ? "correct" : "wrong answer");
        }
    }
}
