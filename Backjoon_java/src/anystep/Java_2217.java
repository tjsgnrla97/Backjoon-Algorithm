package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2217 {
    //로프
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, ans;
    static int[] ropes;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(in.readLine());
        ropes = new int[N];
        for(int i=0; i<N; i++) ropes[i] = Integer.parseInt(in.readLine());
        Arrays.sort(ropes);
        ans = Integer.MIN_VALUE;

        //특정 로프를 사용할 경우
        //그 로프보다 무게가 큰 로프를 모두 사용하는 것이 최댓값
        //최대 무게 w는 ropes[i] * (N-i)
        for (int i=0; i<N; i++){
            ans = Math.max(ans, ropes[i]*(N-i));
        }
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }
}
