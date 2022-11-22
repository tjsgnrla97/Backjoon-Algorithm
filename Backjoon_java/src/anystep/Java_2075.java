package anystep;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java_2075 {
    //N번째 큰 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        input();
        findN();
        System.out.println(pq.poll());
    }

    private static void findN() {
        for (int i=0; i<N-1; i++){
            pq.poll();
        }
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        for (int y=0; y<N; y++){
            stk = new StringTokenizer(in.readLine());
            for (int x=0; x<N; x++){
                pq.offer(Integer.parseInt(stk.nextToken()));
            }
        }
    }
}
