package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1003 {
    // 피보나치 함수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());

        for(int tc=1; tc<=T; tc++){
            int N = Integer.parseInt(in.readLine());
            int[] fibo0 = new int[41];
            int[] fibo1 = new int[41];
            fibo0[0]=1;
            fibo0[1]=0;
            fibo1[0]=0;
            fibo1[1]=1;
            for(int k=2; k<=N; k++){
                fibo0[k] = fibo0[k-1]+fibo0[k-2];
                fibo1[k]=fibo1[k-1]+fibo1[k-2];
            }
            sb.append(fibo0[N]).append(" ").append(fibo1[N]).append("\n");
        }
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
