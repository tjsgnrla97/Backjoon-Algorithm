package anystep;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Java_12605 {
    //단어순서 뒤집기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= N; tc++) {
            String ans = "";
            Stack<String> stack = new Stack<>();
            stk = new StringTokenizer(in.readLine());
            while (stk.hasMoreTokens()) {
                stack.push(stk.nextToken());
            }
            while (!stack.isEmpty()) {
                ans += stack.pop() + " ";
            }
            System.out.println("Case #" + tc + ": " + ans);
        }
    }
}
