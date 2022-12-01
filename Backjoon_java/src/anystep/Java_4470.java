package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4470 {
    //줄 번호
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        for (int i=1; i<=N; i++){
            System.out.println(i+". "+in.readLine());
        }
    }
}
