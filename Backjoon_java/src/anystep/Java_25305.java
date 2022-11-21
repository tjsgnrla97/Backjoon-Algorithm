package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_25305 {
    //커트라인
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N,k;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        sorting();
    }

    private static void sorting() {
        System.out.println(arr[N-1-(k-1)]);
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());
        arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
    }
}
