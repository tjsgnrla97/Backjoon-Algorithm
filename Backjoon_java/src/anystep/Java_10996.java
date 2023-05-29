package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10996 {
    //별 찍기 - 21
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int y=1; y<=2*N; y++){
            if(N==1) {
                System.out.print("*");
                break;
            }
            for (int x=1; x<=N; x++){
                if(y%2==1){
                    if(x%2==1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }else {
                    if(x%2==1){
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
