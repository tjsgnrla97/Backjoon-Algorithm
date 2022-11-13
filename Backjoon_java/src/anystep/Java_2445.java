package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2445 {
    //별 찍기 - 8
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int k=1; k<=2*(N-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=N-1; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int k=1; k<=2*(N-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
