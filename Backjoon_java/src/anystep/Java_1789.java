package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1789 {
    //수들의 합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        long S = Long.parseLong(in.readLine());
        int i=0;
        int ans=0;
        long sum=0L;
        while (true){
            sum += ++i;
            if(sum>S){
                break;
            }
            ans++;
        }
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }
}
