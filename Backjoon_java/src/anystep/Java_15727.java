package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15727 {
    //조별과제를 하려는데 조장이 사라졌다
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        if (N % 5 == 0) System.out.println(N / 5);
        else System.out.println(N / 5 + 1);
    }
}
