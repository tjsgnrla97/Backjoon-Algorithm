package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_6321 {
    //IBM 빼기 1
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int tc = Integer.parseInt(in.readLine());

        for (int T = 0; T < tc; T++) {
            String[] IBM = in.readLine().split("");

            System.out.println("String #" + (T + 1));
            for (int i = 0; i < IBM.length; i++) {
                char temp = IBM[i].charAt(0);
                temp += 1;
                if (temp == 91) {
                    temp = 65;
                }
                System.out.print(temp);
            }
            System.out.println();
            System.out.println();
        }
    }
}
