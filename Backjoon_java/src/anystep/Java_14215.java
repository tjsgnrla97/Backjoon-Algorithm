package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_14215 {
    //세 막대
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] line = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        if (line[0] + line[1] > line[2]) {
            System.out.println(line[0] + line[1] + line[2]);
        } else {
            System.out.println((line[0] + line[1]) * 2 - 1);
        }
    }
}
