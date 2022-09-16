package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_2644 {
    //촌수 계산
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int V,E,man1,man2;
    static List<Integer>[] relation;
    static boolean[] checked;
    static int ans = -1;
    public static void main(String[] args) throws IOException {
        V = Integer.parseInt(in.readLine());
        relation = new ArrayList[V+1];
        checked = new boolean[V+1];
        for(int v=1; v<V+1; v++){
            relation[v] = new ArrayList<>();
        }
        stk = new StringTokenizer(in.readLine());
        man1 = Integer.parseInt(stk.nextToken());
        man2 = Integer.parseInt(stk.nextToken());
        E = Integer.parseInt(in.readLine());
        for(int e=0; e<E; e++){
            stk = new StringTokenizer(in.readLine());
            int parent = Integer.parseInt(stk.nextToken());
            int child = Integer.parseInt(stk.nextToken());
            relation[parent].add(child);
            relation[child].add(parent);
        }
        dfs(man1,man2,0);
        System.out.println(ans+"");
    }

    private static void dfs(int start, int end, int cnt) {
        if(start==end){
            ans = cnt;
            return;
        }
        checked[start] = true;
        for(int from=0; from<relation[start].size(); from++){
            int nextFrom = relation[start].get(from);
            if(!checked[nextFrom]){
                dfs(nextFrom,end,cnt+1);
            }
        }
    }
}
