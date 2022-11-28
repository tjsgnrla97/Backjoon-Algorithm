package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1259 {
    //팰린드롬수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static String cmd="", ans;
    public static void main(String[] args) throws IOException {
        while (cmd!="0"){
            cmd = in.readLine();
            if(cmd.equals("0")) break;
            ans = "";
            for (int i=cmd.length()-1; i>=0; i--){
                ans += cmd.charAt(i)+"";
            }
            if(cmd.equals(ans)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
