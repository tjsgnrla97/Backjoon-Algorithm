package anystep;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Java_2935 {
    //소음
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        BigInteger A = new BigInteger(in.readLine());
        char exp = in.readLine().charAt(0);
        BigInteger B = new BigInteger(in.readLine());
        switch (exp){
            case '+':
                System.out.println(A.add(B));
                break;
            case '*':
                System.out.println(A.multiply(B));
                break;
        }
    }
}
