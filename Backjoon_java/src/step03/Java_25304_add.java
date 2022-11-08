package step03;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25304_add {
    //추가 1. 영수증
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    static int X,N;
    static long ans;
    static int[] product;
    public static void main(String[] args) throws IOException {
        input();
        compareAns();
    }

    private static void compareAns() {
        for(int i=0; i<N; i++){
            for(int num=0; num<product[i+N]; num++){
                ans += product[i];
            }
        }
        if(X == ans){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static void input() throws IOException {
        X = Integer.parseInt(in.readLine());
        N = Integer.parseInt(in.readLine());
        product = new int[N*2];
        for (int i=0; i<N; i++){
            stk = new StringTokenizer(in.readLine());
            product[i] = Integer.parseInt(stk.nextToken());
            product[i+N] = Integer.parseInt(stk.nextToken());
        }
    }
}
