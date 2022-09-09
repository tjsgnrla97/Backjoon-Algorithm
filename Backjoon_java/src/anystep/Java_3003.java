package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_3003 {
    //킹, 퀸, 룩, 비숍, 나이트, 폰
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        stk = new StringTokenizer(in.readLine());
        king -= Integer.parseInt(stk.nextToken());
        queen -= Integer.parseInt(stk.nextToken());
        rook -= Integer.parseInt(stk.nextToken());
        bishop -= Integer.parseInt(stk.nextToken());
        knight -= Integer.parseInt(stk.nextToken());
        pawn -= Integer.parseInt(stk.nextToken());

        sb.append(king).append(" ");
        sb.append(queen).append(" ");
        sb.append(rook).append(" ");
        sb.append(bishop).append(" ");
        sb.append(knight).append(" ");
        sb.append(pawn);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
