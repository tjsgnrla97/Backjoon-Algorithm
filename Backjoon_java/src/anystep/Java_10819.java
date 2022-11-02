package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10819 {
    //차이를 최대로
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, max = Integer.MIN_VALUE;
    static int[] A,sum;
    static boolean[] isVisited;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(in.readLine());
        stk = new StringTokenizer(in.readLine());
        A = new int[N];
        sum = new int[N];
        isVisited = new boolean[N];
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(stk.nextToken());
        }
        dfs(0);
        System.out.println(max);
    }

    private static void dfs(int depth) {
        if(depth == N) {
//            System.out.println("depth : "+depth);
            int ans = 0;
            for(int i=0; i<N-1; i++){
//                System.out.println("sum["+i+"] : "+sum[i]+"sum["+(i+1)+"] : "+sum[i+1]);
                ans += Math.abs(sum[i]-sum[i+1]);
            }
//            System.out.println("ans : "+ans);
            max = Math.max(max, ans);
            return;
        }
        for (int i=0; i<N; i++){
            if(!isVisited[i]){
                sum[depth] = A[i];
//                System.out.println("depth : "+depth+" i : "+i+" sum["+depth+"] : "+sum[depth]+" A["+i+"] : "+A[i]);
                isVisited[i] = true;
                dfs(depth+1);
                isVisited[i] = false;
            }
        }
    }
}
