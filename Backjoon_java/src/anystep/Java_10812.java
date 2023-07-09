package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10812 {
    //바구니 순서 바꾸기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[] basket = new int[N];
        int[] rotation = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int r = 0; r < M; r++) {
            stk = new StringTokenizer(in.readLine());
            int i = Integer.parseInt(stk.nextToken()) - 1;
            int j = Integer.parseInt(stk.nextToken()) - 1;
            int k = Integer.parseInt(stk.nextToken()) - 1;

            int begin = i;

            for (int move = 0; move < j - i + 1; move++) {
                if (k + move <= j) { //k~j
                    rotation[i + move] = basket[k + move];
                } else { //i~k
                    rotation[i + move] = basket[begin++];
                }
            }
            for (int move = 0; move < N; move++) {
                //rotation[move]가 0이면 회전과정에 포함되지 않았음.
                //0이 아니라면 회전을 한 경우
                if (rotation[move] != 0) {
                    basket[move] = rotation[move];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
