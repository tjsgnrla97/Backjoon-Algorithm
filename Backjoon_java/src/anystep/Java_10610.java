package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10610 {
    //30
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    static String N;
    static int[] numCntArr;
    static long NLength;
    public static void main(String[] args) throws IOException {
        N = in.readLine();
        NLength = N.length();
        numCntArr = new int[10];
        long total=0;

        for (int i = 0; i < NLength; i++) {
            int currentNum = Integer.parseInt(N.substring(i,i+1));
            numCntArr[currentNum]++;
            total += currentNum;
        }

        if(!N.contains("0") || total%3 != 0) {
            System.out.println("-1");
            return;
        }

        for(int i = 9; i >= 0; i--) {
            while (numCntArr[i] > 0) {
                sb.append(i);
                numCntArr[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}
