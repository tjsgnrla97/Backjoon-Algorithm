package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1783 {
    //병든 나이트
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N,M,ans;
    public static void main(String[] args) throws IOException {
        input();
        moveKnight();
        System.out.println(ans);
    }

    private static void moveKnight() {
        if(N==1) ans = 1;
        else if(N==2){
            ans = Math.min(4,(M+1)/2);
        }
        else if(M<7){
            ans = Math.min(4,M);
        }
        else{
            ans = 4 + M-6;
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
    }
}
