package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_15969 {
    //행복
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        int[] student = new int[N];
        for (int i = 0; i < N; i++) {
            student[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(student);
        System.out.println(student[N - 1] - student[0]);
    }
}
