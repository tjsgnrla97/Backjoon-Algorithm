package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2501 {
    //약수 구하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            //k번째 약수이면 i 출력
            if (k == 0) {
                System.out.print(i);
                return;
            }
        }
        //k번째 약수가 없으면 0 출력
        System.out.print(0);
    }
}
