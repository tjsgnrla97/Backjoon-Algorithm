package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3062 {
    //수 뒤집기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String num = in.readLine();
            String reverse = "";
            String check = null;

            for (int i = num.length() - 1; i >= 0; i--) {
                reverse += num.charAt(i);
            }

            int sum = Integer.parseInt(num) + Integer.parseInt(reverse);
            String sumNum = Integer.toString(sum);

            for (int i = 0; i < (sumNum.length() / 2); i++) {
                char left = sumNum.charAt(i);
                char right = sumNum.charAt(sumNum.length() - i - 1);

                if (left != right) {
                    check = "PASS";
                    break;
                }
            }
            if (check == null) out.write("YES\n");
            else out.write("NO\n");
        }
        out.flush();
        out.close();
        in.close();
    }
}
