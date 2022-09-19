package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1072 {
    //게임
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static long X,Y;
    static int Z,ans;
    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        X = Integer.parseInt(stk.nextToken());
        Y = Integer.parseInt(stk.nextToken());
        Z = (int) (Y*100/X);
        ans = -1;
        if(Z < 99) {
            ans = (int) Math.ceil((100*Y - X*(Z+1))/(double)(Z-99));
        }
        System.out.println(ans);
    }
}
