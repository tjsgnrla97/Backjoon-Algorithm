package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10409 {
    //서버
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int T = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int ans = 0;
        int sum = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (sum > T) break;
            ans++;
        }
        System.out.println(ans);
    }
}
