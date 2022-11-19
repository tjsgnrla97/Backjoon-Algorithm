package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_10867 {
    //중복 빼고 정렬하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int N, cnt;
    public static void main(String[] args) throws IOException {
        input();
        printAns();
    }

    private static void printAns() throws IOException {
        for (int num : arr){
            if(num!=cnt){
                cnt=num;
                sb.append(cnt).append(" ");
            }
        }
        sb.setLength(sb.length()-1);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        for (int i=0; i<N; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);
        cnt = -1001;
    }
}
