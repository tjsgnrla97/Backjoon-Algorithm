package anystep;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_2164 {
    //카드2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++) q.add(i);
        while (q.size()!=1){
            q.poll();
            q.add(q.poll());
        }
        out.write(q.poll()+"");
        out.flush();
        out.close();
        in.close();
    }
}
