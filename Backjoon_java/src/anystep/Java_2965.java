package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2965 {
    //캥거루 세마리
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int left = Integer.parseInt(stk.nextToken());
        int middle = Integer.parseInt(stk.nextToken());
        int right = Integer.parseInt(stk.nextToken());

        System.out.println(solve(left, middle, right));
    }

    private static int solve(int left, int middle, int right) {
        if (middle - left == 1 && right - middle == 1) return 0;
        int pixPosition = findFixPosition(left, middle, right);

        return Math.abs(pixPosition - middle) - 1;
    }

    private static int findFixPosition(int left, int middle, int right) {
        return right - middle > middle - left ? right : left;
    }
}
