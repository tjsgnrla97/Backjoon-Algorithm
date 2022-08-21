package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Java_1292 {
    //쉽게 푸는 문제
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        stk = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int ans = 0;

        for(int i=0; i<1000; i++){
            for(int j=0; j<=i; j++){
                list.add(i+1);
            }
        }
        for(int i=a-1; i<=b-1; i++){
            ans += list.get(i);
        }
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }
}
