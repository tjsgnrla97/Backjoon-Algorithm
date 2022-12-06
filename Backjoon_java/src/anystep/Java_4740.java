package anystep;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_4740 {
    //거울, 오! 거울
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String cmd = "";
        while (true){
            Stack<String> stack = new Stack<>();
            cmd = in.readLine();
            if(cmd.equals("***")) break;
            for (int i=0; i<cmd.length(); i++){
                stack.push(cmd.charAt(i)+"");
            }
            String ans = "";
            for (int i=0; i<cmd.length(); i++){
                ans += stack.pop();
            }
            System.out.println(ans);
        }
    }
}
