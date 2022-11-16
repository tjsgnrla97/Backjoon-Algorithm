package step16;

import java.io.*;
import java.util.StringTokenizer;

public class Java_15652 {
    //4. 백트래킹
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        dfs(1,0);
        System.out.println(sb.toString());
    }

    private static void dfs(int start, int depth) {
        if(depth==M){
            for (int num : arr){
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i=start; i<=N; i++){
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        arr = new int[M];
    }
}
