package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2446 {
    //별 찍기 - 9
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for(int y=1; y<=N; y++){
            for(int x=1; x<=y-1; x++){
                System.out.print(" ");
            }
            for(int x=N*2-y; x>=y; x--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y=1; y<=N-1; y++){
            for(int x=N-1; x>y; x--){
                System.out.print(" ");
            }
            for(int x=1; x<=2*y+1; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
