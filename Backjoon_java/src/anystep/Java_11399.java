package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_11399 {
    //ATM
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        in.close();

        int[] human = new int[N];
        for (int i = 0; i < N; i++) {
            human[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(human);

        int totalTime = 0;
        int waitTime = 0;
        for(int time : human) {
            waitTime += time;
            totalTime += waitTime;
        }
        out.write(totalTime+"");
        out.flush();
        out.close();
    }
}
