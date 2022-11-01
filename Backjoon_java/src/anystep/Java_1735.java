package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1735 {
    //분수 합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int C = Integer.parseInt(stk.nextToken());
        int D = Integer.parseInt(stk.nextToken());

        int last_B = B * D/gcd_chage(B,D);
        int last_A = A*(last_B/B)+C*(last_B/D);
        int last_gcd = gcd_chage(last_A, last_B);
        System.out.println(last_A/last_gcd+" "+last_B/last_gcd);
    }

    private static int gcd_chage(int a, int b) {
        if(a<b) return gcd(b,a);
        return gcd(a,b);
    }

    private static int gcd(int a, int b) {
        if(b==0) return a;
        else{
            int r=a%b;
            return gcd(b,r);
        }
    }
}
