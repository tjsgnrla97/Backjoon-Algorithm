package step09;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2566 {
    //2. 최댓값
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    static int[][] map = new int[9][9];
    static int ans, ansY, ansX;
    public static void main(String[] args) throws IOException {
        input();
        searchMaxNum();
        printAns();
    }

    private static void printAns() throws IOException {
        sb.append(ans).append("\n").append(ansY).append(" ").append(ansX);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }

    private static void searchMaxNum() {
        for (int y=0; y<9; y++){
            for (int x=0; x<9; x++){
                if(ans <= map[y][x]) {
                    ans = map[y][x];
                    ansY = y+1;
                    ansX = x+1;
                }
            }
        }
    }

    private static void input() throws IOException {
        for (int y=0; y<9; y++){
            stk = new StringTokenizer(in.readLine());
            for(int x=0; x<9; x++){
                map[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
    }
}
