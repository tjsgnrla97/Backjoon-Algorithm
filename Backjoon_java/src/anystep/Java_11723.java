package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11723 {
    //집합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(in.readLine());
        int s = 0;
        for(int i=0; i<M; i++){
            stk = new StringTokenizer(in.readLine());
            String cmd = stk.nextToken();
            switch (cmd){
                case "all":
                    s = (1<<21) - 1;
                    break;
                case "empty":
                    s=0;
                    break;
                default:
                    int x = Integer.parseInt(stk.nextToken());
                    switch (cmd) {
                        case "add":
                            s |= (1<<x);
                            break;
                        case "remove":
                            s &= ~(1 << x);
                            break;
                        case "check":
                            sb.append((s & (1<<x)) != 0? 1: 0).append("\n");
                            break;
                        case "toggle":
                            s ^= (1<<x);
                            break;
                    }
            }
        }
        System.out.println(sb);
    }
}
