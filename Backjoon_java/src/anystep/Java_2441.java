package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2441 {
    //별 찍기 - 4
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for(int y=0; y<N; y++) {
            for(int space=0; space<y; space++){
                System.out.print(" ");
            }
            for(int star=0; star<(N-y); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
