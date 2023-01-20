package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2587 {
    //대표값2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int sum = 0;
        int mid = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(in.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        int avg = sum / 5;
        mid = arr[2];
        System.out.println(avg + "\n" + mid);
    }
}
