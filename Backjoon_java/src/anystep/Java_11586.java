package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11586 {
    //지영 공주님의 마법 거울
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = in.readLine();
        }
        int status = Integer.parseInt(in.readLine());

        for (int i = 0; i < str.length; i++) {
            String line = str[i];
            String reverse = str[str.length - 1 - i];
            for (int j = 0; j < line.length(); j++) {
                if (status == 1) {
                    System.out.print(line.charAt(j));
                } else if (status == 2) {
                    System.out.print(line.charAt(line.length() - 1 - j));
                } else if (status == 3) {
                    System.out.print(reverse.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
