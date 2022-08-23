package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11403 {
    //경로 찾기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N;
    static int[][] map;
    public static void main(String[] args) throws IOException {
        input();
        floid();
        drawMap();
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        map = new int[N][N];
        for(int from=0; from<N; from++){
            stk = new StringTokenizer(in.readLine());
            for(int to=0; to<N; to++){
                map[from][to] = Integer.parseInt(stk.nextToken());
            }
        }
    }
    private static void floid() {
        for(int mid=0; mid<N; mid++){
            for(int from=0; from<N; from++){
                for(int to=0; to<N; to++){
                    if(map[from][mid]==1 && map[mid][to]==1){
                        map[from][to]=1;
                    }
                }
            }
        }
    }
    private static void drawMap() {
        for(int from=0; from<N; from++){
            for(int to=0; to<N; to++){
                sb.append(map[from][to]+" ");
            }
            sb.append("\n");
        }
    }
}
