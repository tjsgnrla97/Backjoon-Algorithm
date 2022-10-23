package anystep;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Java_10866 {
    //덱
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        Deque<Integer> dq = new LinkedList<>();

        int N = Integer.parseInt(in.readLine());
        String cmd = "";
        int num = 0;

        while (N --> 0) {
            stk = new StringTokenizer(in.readLine());

            if (stk.countTokens() > 1) {
                cmd = stk.nextToken();
                num = Integer.parseInt(stk.nextToken());

                if(cmd.startsWith("push_f")) {
                    dq.offerFirst(num);
                }
                else if(cmd.startsWith("push_b")){
                    dq.offerLast(num);
                }
            }
            else {
                cmd = stk.nextToken();

                if (cmd.startsWith("f")) {
                    if(dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekFirst()).append('\n');
                    }
                }
                else if(cmd.startsWith("b")) {
                    if(dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.peekLast()).append('\n');
                    }
                }
                else if(cmd.startsWith("s")) {
                    sb.append(dq.size()).append('\n');
                }
                else if(cmd.startsWith("e")) {
                    if(dq.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                }
                else if(cmd.startsWith("pop_f")) {
                    if(dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.removeFirst()).append('\n');
                    }
                }
                else if(cmd.startsWith("pop_b")) {
                    if(dq.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(dq.removeLast()).append('\n');
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
