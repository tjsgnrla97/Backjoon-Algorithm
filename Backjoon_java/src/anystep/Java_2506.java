package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2506 {
    //점수계산
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
                //연속된 수 체크하면서 연속될 경우
                //count를 하나씩 더해주어
                //sum에 더해준다.
            } else {
                cnt = 0;
                //연속된값 체크시 후 연속되지 않을 경우
                //0으로 초기화 하여 검색한다.
            }
        }
        System.out.println(sum);
    }
}
