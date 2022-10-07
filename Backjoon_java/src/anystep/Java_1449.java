package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1449 {
    //수리공 항승
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int ans;
    static int[] repairPoint;
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int repairNum = Integer.parseInt(stk.nextToken());
        int tape = Integer.parseInt(stk.nextToken());
        repairPoint = new int[repairNum];
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < repairNum; i++) {
            repairPoint[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(repairPoint);

        int repairRange = (int)(repairPoint[0] - 0.5 + tape);
        ans++;

        for (int i = 1; i < repairNum; i++) {
            if(repairRange < (int)(repairPoint[i]+0.5)) {
                repairRange = (int)(repairPoint[i]-0.5+tape);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
