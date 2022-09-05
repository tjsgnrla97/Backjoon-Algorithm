package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_10845 {
    //큐
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        Queue<Integer> q = new LinkedList<>();
        int back = -1;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(in.readLine());
            String cmd = stk.nextToken();
            switch(cmd) {
            case "push":
                back = Integer.parseInt(stk.nextToken());
                q.add(back);
                break;
            case "pop":
                if(q.isEmpty()) {
                    sb.append("-1").append("\n");
                    break;
                }
                sb.append(q.poll()).append("\n");
                break;
            case "size":
                sb.append(q.size()).append("\n");
                break;
            case "empty":
                sb.append(q.isEmpty()? 1 : 0).append("\n");
                break;
            case "front":
                sb.append(q.isEmpty()? -1: q.peek()).append("\n");
                break;
            case "back":
                sb.append(q.isEmpty()? -1: back).append("\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
