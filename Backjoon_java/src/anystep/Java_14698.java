package anystep;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Java_14698 {
    //전생했더니 슬라임 연구자였던 건에 대하여 (Hard)
    //메모리 145720KB 시간 2608ms
    //풀이시간 28분 17초
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int T, N;
    static long ans;
    static PriorityQueue<Long> pq;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            input();
            unionSlime();
            printAns();
        }
        out.close();
        in.close();
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        pq = new PriorityQueue<>();
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            pq.offer(Long.parseLong(stk.nextToken()));
        }
        ans = 1;
    }

    private static void unionSlime() {
        while (pq.size() > 1) {
            long slime1 = pq.poll();
            long slime2 = pq.poll();
            long union = slime1 * slime2;
            ans *= union % 1000000007;
            ans %= 1000000007;
            pq.offer(union);
        }
    }

    private static void printAns() throws IOException {
        out.write(ans + "\n");
        out.flush();

    }
}
