package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Java_2638 {
    //치즈
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;

    static public class Cheese {
        int y;
        int x;

        public Cheese(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    static ArrayList<Cheese> cheeseList;
    static int cheeseLife = 0;
    static int time = 0;

    public static void main(String[] args) throws IOException {
        input();
        process();
    }


    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());

        map = new int[N][M];
        cheeseList = new ArrayList<>();
        for (int y = 0; y < N; y++) {
            stk = new StringTokenizer(in.readLine());
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(stk.nextToken());
                if (map[y][x] == 1) {
                    cheeseList.add(new Cheese(y, x));
                    cheeseLife++;
                }
            }
        }
    }

    private static void process() {
        while (cheeseLife != 0) {
            time++;
            visited = new boolean[N][M];
            dfs(0, 0);
            meltCheese();
        }
        System.out.println(time);
    }


    private static void dfs(int y, int x) {
        visited[y][x] = true;
        map[y][x] = 2;

        for (int d = 0; d < 4; d++) {
            int ny = y + dy[d];
            int nx = x + dx[d];

            if (nx < 0 || ny < 0 || ny >= N || nx >= M) continue;
            if (visited[ny][nx] || map[ny][nx] == 1) continue;

            dfs(ny, nx);
        }
    }

    private static void meltCheese() {
        for (int i = 0; i < cheeseList.size(); i++) {
            int y = cheeseList.get(i).y;
            int x = cheeseList.get(i).x;
            int outAirCnt = 0;

            for (int d = 0; d < 4; d++) {
                int ny = y + dy[d];
                int nx = x + dx[d];

                if (map[ny][nx] == 2) {
                    outAirCnt++;
                }
            }
            if (outAirCnt >= 2) {
                map[y][x] = 0;
                cheeseLife--;
                cheeseList.remove(i);
                i--;
            }
        }
    }
}
