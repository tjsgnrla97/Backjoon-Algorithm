package step04;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10807_add {
    //추가 1.개수 세기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    static int N,findNum,ans;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        input();
        findNumCnt();
    }

    private static void findNumCnt() throws IOException {
        if(findNum<0) findNum = Math.abs(findNum)+100;
        out.write(arr[findNum]+"");
        out.flush();
        out.close();
        in.close();
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        arr = new int[201];
        stk = new StringTokenizer(in.readLine());
        for (int i=0; i<N; i++){
            int num = Integer.parseInt(stk.nextToken());
            if(num<0) arr[Math.abs(num)+100]++;
            else arr[num]++;
        }
        findNum = Integer.parseInt(in.readLine());
    }
}
