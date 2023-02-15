package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14726 {
    //신용카드 판별
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        int[] card = new int[16];

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            String num = in.readLine();
            for (int i = 0; i < 16; i++) {
                card[i] = num.charAt(i) - '0';
            }
            for (int i = 15; i >= 0; i--) {
                if (i % 2 == 0) {
                    card[i] *= 2;
                    if (card[i] >= 10) {
                        int temp = card[i] % 10;
                        card[i] /= 10;
                        card[i] += temp;
                    }
                }
                sum += card[i];
            }
            if (sum % 10 == 0) {
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }
    }
}
