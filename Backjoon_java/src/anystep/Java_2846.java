package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2846 {
    //오르막길
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int max = 0;
        int first = 0;
        int last = 0;
        first = arr[0];
        for (int i = 0; i < N - 1; i++) {
            int front = arr[i];
            int next = arr[i + 1];
            if (i == N - 2 && arr[i] < arr[i + 1]) {
                last = arr[i + 1];
                max = Math.max(max, last - first);
                break;
            }
            if (front >= next) {
                last = front;
                max = Math.max(max, last - first);
                first = next;
            }
        }
        System.out.println(max);
    }
}
