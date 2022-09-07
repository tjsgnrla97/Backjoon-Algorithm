package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_2606 {
    //바이러스
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int V,E,active,ans;
    static List<Integer>[] computers;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        input();
        virusActive();
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }

    private static void virusActive() {
        active = 1;
        dfs(active);
    }

    private static void dfs(int active) {
        isVisited[active] = true;
        for(int from : computers[active]) {
            if(isVisited[from] == false) {
                ans++;
                dfs(from);
            }
        }
    }

    private static void input() throws IOException {
        V = Integer.parseInt(in.readLine());
        E = Integer.parseInt(in.readLine());
        computers = new ArrayList[V+1];
        isVisited = new boolean[V+1];

        for(int v=1; v<=V; v++) {
            computers[v] = new ArrayList<>();
        }

        for(int line = 0; line < E; line++) {
            stk = new StringTokenizer(in.readLine());
            int from = Integer.parseInt(stk.nextToken());
            int to = Integer.parseInt(stk.nextToken());
            computers[from].add(to);
            computers[to].add(from);
        }
    }
}
