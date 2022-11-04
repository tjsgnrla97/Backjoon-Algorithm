package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_13305 {
    //주유소
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N;
    static long ans,minPrice;
    static int[] distance, price;
    public static void main(String[] args) throws IOException {
        input();
        grid();
        System.out.println(ans);
    }

    private static void grid() {
        minPrice = price[0];
        for(int i=0; i<N-1; i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }
            ans += (minPrice * distance[i]);
        }
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        distance = new int[N-1];
        price = new int[N];
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<N-1; i++){
            distance[i] = Integer.parseInt(stk.nextToken());
        }
        stk = new StringTokenizer(in.readLine());
        for (int i=0; i<N; i++){
            price[i] = Integer.parseInt(stk.nextToken());
        }
    }
}
