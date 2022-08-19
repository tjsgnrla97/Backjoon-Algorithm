package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2747 {
    //피보나치 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int N1 = 0;
        int N2 = 0;
        int temp1 = 0;
        int temp2 = 0;
        for(int i=0; i<N; i++){
            if(i==0 || i==1) {
                N1 = N2;
                N2 = 1;
            }
            else{
                temp1 = N1;
                temp2 = N2;
                N1 = temp2;
                N2 = temp1+temp2;
            }
        }
        out.write(N2+"");
        out.flush();
        out.close();
        in.close();
    }
}
