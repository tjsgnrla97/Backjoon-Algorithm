package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_1966 {
    //프린터 큐
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int T,N,M,ans;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());
        for(int tc = 1; tc <= T; tc++) {
            stk = new StringTokenizer(in.readLine());
            N = Integer.parseInt(stk.nextToken());
            M = Integer.parseInt(stk.nextToken());
            ans=0;
            Queue<int[]> q = new LinkedList<>();
            stk = new StringTokenizer(in.readLine());
            for(int i = 0; i < N; i++) {
                q.add(new int[]{i,Integer.parseInt(stk.nextToken())});
            }

            while(true) {
                int now[] = q.remove();
                boolean flag = true;

                for(int queue[] : q) {
                    if(queue[1]>now[1]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    ans++;
                    if(now[0] == M) break;
                }else {
                    q.add(now);
                }
            }
            System.out.println(ans);
        }
    }
}
