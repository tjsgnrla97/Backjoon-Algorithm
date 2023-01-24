package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3058 {
    //짝수를 찾아라
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        int[] data = new int[7];
        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            int min = 101;
            stk = new StringTokenizer(in.readLine());
            for (int i = 0; i < 7; i++) {
                data[i] = Integer.parseInt(stk.nextToken());
                if ((data[i] % 2) == 0) {
                    sum += data[i];
                    if (data[i] < min) {
                        min = data[i];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
