package anystep;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Java_11098 {
    //첼시를 도와줘!
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(in.readLine());
            int max = 0;
            Map<Integer, String> unit = new HashMap<>();
            for (int i = 0; i < N; i++) {
                stk = new StringTokenizer(in.readLine());
                int cost = Integer.parseInt(stk.nextToken());
                max = Math.max(max, cost);
                unit.put(cost, stk.nextToken());
            }
            System.out.println(unit.get(max));
        }
    }
}
