package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11004 {
    //K번째 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk  = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        int[] arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        while (N-- > 0) arr[N] = Integer.parseInt(stk.nextToken());
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
    }
}
