package anystep;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java_1927 {
    //최소 힙
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(x -> x));

        for(int i=0; i<N; i++){
            int value = Integer.parseInt(in.readLine());
            if(value==0){
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            }else{
                pq.add(value);
            }
        }
        in.close();
    }
}
