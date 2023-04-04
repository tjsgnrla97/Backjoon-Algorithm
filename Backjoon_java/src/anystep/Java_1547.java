package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1547 {
    //공
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        //공의 위치
        int num = 1;

        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(in.readLine());
            int X = Integer.parseInt(stk.nextToken());
            int Y = Integer.parseInt(stk.nextToken());
            //공의 위치가 바뀔 경우 공의 위치를 재 저장
            if (X == num) {
                num = Y;
            } else if (Y == num) {
                num = X;
            }
        }

        System.out.println(num);
    }
}
