package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_23795 {
    //사장님 도박은 재미로 하셔야 합니다.
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int num = 0;
        int sum = 0;
        while (true) {
            num = Integer.parseInt(in.readLine());
            if (num == -1) break;
            sum += num;
        }
        System.out.println(sum);
    }
}
