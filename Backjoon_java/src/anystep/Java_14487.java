package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_14487 {
    //욱제는 효도쟁이야!!
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        int[] arr = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        for (int i = 0; i < N - 1; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
